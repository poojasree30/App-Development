package com.ecommerce.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name="learning")
public class model {
    @Id
    private int id;
    private String username;
    private String password;
    private String fire;
    private String quest;
    private String heart;

    private Timestamp login_time;

    public Timestamp getLogin_time() {
        return login_time;
    }

    public void setLogin_time(Timestamp login_time) {
        this.login_time = login_time;
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword (String password) {
        this.password = password;
    }
    public String getFire() {
        return fire;
    }

    public void setFire(String Fire) {
        this.fire = fire;
    }

    public String getQuest() {
        return quest;
    }

    public void setQuest (String quest) {
        this.quest = quest;
    }
    public String getHeart(){
        return heart;
    }
    public void setHeart(String heart){
        this.heart=heart;
    }

    public model(int id, String username, String password,String fire,String quest,String heart,Timestamp login_time) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.fire=fire;
        this.quest=quest;
        this.heart=heart;
        this.login_time=new Timestamp(new Date().getTime());
    }
    public model() {

    }
}
