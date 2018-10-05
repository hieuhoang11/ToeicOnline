package vn.hieuhoang.core.service;

import vn.hieuhoang.core.dto.UserDTO;
import vn.hieuhoang.core.persistance.entity.UserEntity;

/**
 * Created by Hieu Hoang on 30/08/2018.
 */
public interface UserService {
    UserDTO isUserExist(UserDTO dto);
    UserDTO findRoleByUser(UserDTO dto);
}
