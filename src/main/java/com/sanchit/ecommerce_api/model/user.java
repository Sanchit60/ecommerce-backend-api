package com.sanchit.ecommerce_api.model;

import jakarta.persistence.*;

import javax.management.relation.Role;

@Entity
@Table(name = "users")
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @Column(unique = true)
    private String email;
    private String password; // We'll hash it later with BCrypt

    @Enumerated(EnumType.STRING)
    private Role role;
}
