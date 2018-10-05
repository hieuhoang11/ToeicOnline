package vn.hieuhoang.core.utils;

import vn.hieuhoang.core.dto.RoleDTO;
import vn.hieuhoang.core.persistance.entity.RoleEntity;

/**
 * Created by Hieu Hoang on 22/08/2018.
 */
public class RoleBeanUtil {
    public static RoleDTO entity2Dto (RoleEntity entity) {
        RoleDTO dto = new RoleDTO();
        dto.setRoleId(entity.getRoleId());
        dto.setName(entity.getName());
        return dto;
    }

    public static RoleEntity dto2Entity (RoleDTO dto) {
        RoleEntity entity = new RoleEntity();
        entity.setRoleId(dto.getRoleId());
        entity.setName(dto.getName());
        return entity;
    }
}
