package com.idho.routingapps.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Idho
 */
@Entity
@Data
public class UserRole {

    @Id
    private int idUserRole;
    private String roleName;

}
