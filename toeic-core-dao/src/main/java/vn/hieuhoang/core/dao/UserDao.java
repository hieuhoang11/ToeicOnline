package vn.hieuhoang.core.dao;

import vn.hieuhoang.core.data.dao.GenericDao;
import vn.hieuhoang.core.persistance.entity.UserEntity;

/**
 * Created by Hieu Hoang on 30/08/2018.
 */
public interface UserDao extends GenericDao<Integer , UserEntity> {
    UserEntity findUserByUsernameAndPassword (String name , String passWord) ;
}
