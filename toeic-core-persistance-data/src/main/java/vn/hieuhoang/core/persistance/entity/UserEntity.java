package vn.hieuhoang.core.persistance.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by Hieu Hoang on 12/08/2018.
 */

@Entity
@Table(name="user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @Column(name = "name")
    private String name ;

    @Column(name = "password")
    private String passWord;

    @Column(name = "fullname")
    private String fullName;

    @Column(name = "createddate")
    private Timestamp createdDate;

    @ManyToOne
    @JoinColumn(name = "roleid")
    private RoleEntity role;

    @OneToMany(mappedBy = "user" ,fetch = FetchType.LAZY)
    private List<CommentEntity> commentEntityList;


    public RoleEntity getRoleEntity() {
        return role;
    }

    public void setRoleEntity(RoleEntity role) {
        this.role = role;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }
}

