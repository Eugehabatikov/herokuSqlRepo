package ru.simple.pojo;

import java.util.Date;

public class User {
    int id;
    String userName;
    Date birthDay;
    String address;

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", username='" + userName + '\'' +
                ", birthday=" + birthDay +
                ", address='" + address + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setBirthDay(String s){
    }
}
