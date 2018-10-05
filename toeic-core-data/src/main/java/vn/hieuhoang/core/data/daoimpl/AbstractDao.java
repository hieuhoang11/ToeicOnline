package vn.hieuhoang.core.data.daoimpl;

import org.hibernate.*;
import vn.hieuhoang.core.common.constant.CoreConstant;
import vn.hieuhoang.core.common.utils.HibernateUtil;
import vn.hieuhoang.core.data.dao.GenericDao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Hieu Hoang on 12/08/2018.
 */
public class AbstractDao <ID extends Serializable, T> implements GenericDao<ID,T> {
    private Class<T> persistanceClass ;
    public AbstractDao() {
        this.persistanceClass = (Class<T>) ((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[1];
    }
    public String getPersistanceClassName() {
        return this.persistanceClass.getSimpleName();
    }

    public List<T> findAll() {
        List<T> list = new ArrayList<T>();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            StringBuilder sql = new StringBuilder("from ");
            sql.append(this.getPersistanceClassName());
            Query query = session.createQuery(sql.toString());
            list = query.list();
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
        }
        return list;
    }


    public T update(T entity) {
        T result = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            Object object = session.merge(entity);
            result = (T) object;
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            throw e ;
        } finally {
            session.close();
        }
        return result;
    }

    public void save(T entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.persist(entity);
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
        }
    }

    public Integer delete(List<ID> ids) {
        Integer count = 0 ;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            for (ID item : ids) {
                T t = (T) session.get(persistanceClass,item);
                session.delete(t);
                count++ ;
            }
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            throw e ;
        }
        return count;
    }


    public T findByID (ID id) {
        T result = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            result = (T) session.get(persistanceClass,id);
            if(result == null) {
                throw new ObjectNotFoundException("NOT FOUND " + id ,null);
            }
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
        }
        return result;
    }

    public Object[] findByProperty(Map<String , Object> property , String sortExpression, String sortDirection , Integer offset  , Integer limit) {
        List<T> list = new ArrayList<T>();

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Object totalItem = 0 ;
        String [] params  = new String[property.size()];
        Object [] values = new Object[property.size()];
        int i = 0 ;
        for (Map.Entry item : property.entrySet()) {
            params[i] = item.getKey().toString();
            values[i] = item.getValue();
            i++;
        }
        try {
            StringBuilder sql1 = new StringBuilder("from ");
            sql1.append(getPersistanceClassName());
            if (property.size() > 0) {
                sql1.append(" where 1=1 ") ;
                for (int i1 = 0 ; i1 < params.length ; i1++ ) {
                    sql1.append(" and ").append(params[i1]).append("= :" + params[i1] + "");
                }
            }

            if (sortExpression != null && sortDirection != null) {
                sql1.append(" order by ").append(sortExpression);
                sql1.append(" ").append(sortDirection.equals(CoreConstant.SORT_ASC) ? "asc" : "desc");
            }
            Query query1 = session.createQuery(sql1.toString());
            if (property.size() > 0) {
                for (int i1 = 0 ; i1 < params.length ; i1++ ) {
                    query1.setParameter(params[i1], values[i1]);
                }
            }
            if (offset != null && offset >= 0 ) {
                query1.setFirstResult(offset);
            }
            if (limit != null && offset > 0) {
                query1.setMaxResults(limit);
            }
            list = query1.list();
            StringBuilder sql2 = new StringBuilder("select count(*) from ");
            sql2.append(getPersistanceClassName());
            if (property.size() > 0) {
                sql2.append(" where 1=1 ") ;
                for (int k = 0 ; k < params.length ; k++ ) {
                    sql2.append(" and ").append(params[k]).append("= :" + params[k] + "") ;
                }
            }
            Query query2 = session.createQuery(sql2.toString());
            if (property.size() > 0) {
                for (int k1 = 0 ; k1 < params.length ; k1++ ) {
                    query2.setParameter(params[k1], values[k1]);
                }
            }
            totalItem = query2.list().get(0);
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
        }
        return new Object[]{totalItem , list};
    }
}
