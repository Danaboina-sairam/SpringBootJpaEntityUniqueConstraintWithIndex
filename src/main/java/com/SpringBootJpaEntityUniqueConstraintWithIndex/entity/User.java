package com.SpringBootJpaEntityUniqueConstraintWithIndex.entity;

import jakarta.persistence.*;

@Table(
        name="USER_DETAILS",
        schema="ONBOARDING",
        uniqueConstraints = {
                @UniqueConstraint(columnNames ="phone"),              //single column unique constraint
                @UniqueConstraint(columnNames = {"name","email"})     //composite column unique constraint
        },
        indexes={
                @Index(name="index_phone",columnList = "phone"),
                @Index(name="index_name_email",columnList = "name,email")
        })
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phone;
    public User(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
