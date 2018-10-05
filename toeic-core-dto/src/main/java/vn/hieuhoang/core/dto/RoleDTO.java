package vn.hieuhoang.core.dto;

import java.io.Serializable;

/**
 * Created by Hieu Hoang on 22/08/2018.
 */
public class RoleDTO implements Serializable {
    private Integer roleId;
    private String name ;

    public Integer getRoleId() {
        return roleId;
    }
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
