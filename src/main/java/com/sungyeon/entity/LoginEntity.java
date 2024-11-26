package com.sungyeon.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "loginentity")
public class LoginEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UID", nullable = false)
    private Long UID;

    @Column(name = "ID", nullable = false)
    private String ID;

    @Column(name = "PW", nullable = false)
    private String PW;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "role", nullable = false)
    private String role;

    @Column(name = "createdate", nullable = false)
    private LocalDateTime createdate;
}