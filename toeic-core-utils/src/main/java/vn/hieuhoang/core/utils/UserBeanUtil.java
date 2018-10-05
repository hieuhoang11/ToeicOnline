package vn.hieuhoang.core.utils;

import vn.hieuhoang.core.dto.UserDTO;
import vn.hieuhoang.core.persistance.entity.UserEntity;

/**
 * Created by Hieu Hoang on 22/08/2018.
 */
public class UserBeanUtil {
    public static UserDTO entity2Dto (UserEntity entity) {
        UserDTO dto = new UserDTO();
        dto.setUserId(entity.getUserId());
        dto.setName(entity.getName());
        dto.setPassWord(entity.getPassWord());
        dto.setCreatedDate(entity.getCreatedDate());
        dto.setFullName(entity.getFullName());
        dto.setRoleDTO(RoleBeanUtil.entity2Dto(entity.getRoleEntity()));
        return dto;
    }

    public static UserEntity Dto2Entity (UserDTO dto) {
        UserEntity entity = new UserEntity();
        entity.setUserId(dto.getUserId());
        entity.setName(dto.getName());
        entity.setPassWord(dto.getPassWord());
        entity.setCreatedDate(dto.getCreatedDate());
        entity.setFullName(dto.getFullName());
        entity.setRoleEntity(RoleBeanUtil.dto2Entity(dto.getRoleDTO()));
        return entity;
    }
}
