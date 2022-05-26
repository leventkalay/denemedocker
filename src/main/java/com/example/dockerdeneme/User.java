package com.example.dockerdeneme;

import javax.persistence.*;

@Entity
@Table(name = "users") //don't use user because user is reserved name on PostgreSQL.
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username",  length = 100)
    private String username;

    @Column(name = "name",length = 100)
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
