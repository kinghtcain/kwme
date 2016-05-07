package com.alphatheta.kw.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name="kw_user")
@Entity
public class User {

    private String userId;
    private String userName;
    private String userAge;

    public User(){
    }
    public User(String userId,String userName,String userAge){
        this.userId = userId;
        this.userAge = userAge;
        this.userName = userName;
    }
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
