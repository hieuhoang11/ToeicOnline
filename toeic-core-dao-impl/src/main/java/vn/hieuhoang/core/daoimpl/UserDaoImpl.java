package vn.hieuhoang.core.daoimpl;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import vn.hieuhoang.core.common.utils.HibernateUtil;
import vn.hieuhoang.core.dao.UserDao;
import vn.hieuhoang.core.data.daoimpl.AbstractDao;
import vn.hieuhoang.core.persistance.entity.UserEntity;

/**
 * Created by Hieu Hoang on 30/08/2018.
 */
public class UserDaoImpl extends AbstractDao<Integer,UserEntity> implements UserDao {
    public UserEntity findUserByUsernameAndPassword(String name, String passWord) {
        UserEntity entity = new UserEntity();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            StringBuilder sql = new StringBuilder("FROM UserEntity WHERE name = :name AND password = :password ");
            Query query = session.createQuery(sql.toString());
            query.setParameter("name" ,name);
            query.setParameter("password" ,passWord);
            entity = (UserEntity) query.uniqueResult();
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
        }
        return entity;
    }
}
