package com.example.week.models;

import com.example.week.enums.AccountStatus;
import com.example.week.enums.RoleStatus;
import jakarta.persistence.*;

@Entity
@NamedQueries({
        @NamedQuery(name = "Role.findByAccId",query = "select r from Role r join GrantAccess g on r.id=g.role.id where g.grantStatus=1 and  g.account.id =:id"),
        @NamedQuery(name = "Role.findByRoleName",query = "select r from Role r where r.role_name=:name")
})
public class Role {
    @Id
    private String role_id;
    private String role_name;
    private String description;
    @Enumerated(EnumType.ORDINAL)
    private RoleStatus status;

    public Role() {
    }

    public Role(String role_id, String role_name, String description, RoleStatus status) {
        this.role_id = role_id;
        this.role_name = role_name;
        this.description = description;
        this.status = status;
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RoleStatus getStatus() {
        return status;
    }

    public void setStatus(RoleStatus status) {
        this.status = status;
    }
}
