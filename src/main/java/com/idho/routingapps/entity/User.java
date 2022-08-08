package com.idho.routingapps.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * @author Idho
 */
//https://daengweb.id/serial-spring-boot-crud-dengan-spring-data-jpa
//untuk merapikan text di intellij gunakan
@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Size(max = 100)
    private String username;
    private String password;
    private int umur;


}
