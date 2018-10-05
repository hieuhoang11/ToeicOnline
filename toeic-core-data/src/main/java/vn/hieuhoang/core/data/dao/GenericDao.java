package vn.hieuhoang.core.data.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by Hieu Hoang on 12/08/2018.
 */
public interface GenericDao <ID extends Serializable,T> {
    List<T> findAll();
    T update(T entity);
    void save (T entity);
    Integer delete (List<ID> ids);
    T findByID (ID id) ;
    Object[] findByProperty(Map<String , Object> property, String sortExpression , String sortDirection , Integer offset , Integer limit);
}
