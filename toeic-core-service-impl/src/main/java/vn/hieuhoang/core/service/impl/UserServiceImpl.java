package vn.hieuhoang.core.service.impl;

import vn.hieuhoang.core.dao.UserDao;
import vn.hieuhoang.core.daoimpl.UserDaoImpl;
import vn.hieuhoang.core.dto.UserDTO;
import vn.hieuhoang.core.persistance.entity.UserEntity;
import vn.hieuhoang.core.service.UserService;
import vn.hieuhoang.core.utils.UserBeanUtil;

/**
 * Created by Hieu Hoang on 30/08/2018.
 */
public class UserServiceImpl implements UserService {

    public UserDTO isUserExist(UserDTO dto) {
        UserDao userDAO = new UserDaoImpl();
        UserEntity entity = userDAO.findUserByUsernameAndPassword(dto.getName(),dto.getPassWord());
        return UserBeanUtil.entity2Dto(entity);
    }

    public UserDTO findRoleByUser(UserDTO dto) {
        UserDao userDAO = new UserDaoImpl();
        UserEntity entity = userDAO.findUserByUsernameAndPassword(dto.getName(),dto.getPassWord());
        return UserBeanUtil.entity2Dto(entity);
    }
}
