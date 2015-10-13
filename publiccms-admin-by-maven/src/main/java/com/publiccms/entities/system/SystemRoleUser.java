package com.publiccms.entities.system;

// Generated 2015-7-20 11:26:18 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * SystemRoleUser generated by hbm2java
 */
@Entity
@Table(name = "system_role_user")
public class SystemRoleUser implements java.io.Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private Integer id;
    private int roleId;
    private int userId;

    public SystemRoleUser() {
    }

    public SystemRoleUser(int roleId, int userId) {
        this.roleId = roleId;
        this.userId = userId;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "role_id", nullable = false)
    public int getRoleId() {
        return this.roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Column(name = "user_id", nullable = false)
    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

}
