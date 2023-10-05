package com.ecommerce.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="learning")
public class model {
    @Id
    private int id;
    private String username;
    private String passsword;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasssword() {
        return passsword;
    }

    public void setPasssword(String passsword) {
        this.passsword = passsword;
    }

    public model(int id, String username, String passsword) {
        this.id = id;
        this.username = username;
        this.passsword = passsword;
    }
    public model() {

    }
}
