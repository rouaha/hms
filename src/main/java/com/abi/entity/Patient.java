package com.abi.entity;

import javax.persistence.*;

/**
 * Created by shahidul on 5/4/17.
 */
@Entity
@Table(name="Patient")
public class Patient {
    @Id
    @GeneratedValue
    @Column(name="serial_no")
    private int serialNo;

    @Column(name="user_name")
    private String userName;

    @Column(name="email")
    private String email;

    @Column(name="date_of_birth")
    private String db;
    @Column(name="p_age")
    private int age;

    @Column(name="health_id")
    private String healthId;

    @Column(name="status")
    private String status;

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHealthId() {
        return healthId;
    }

    public void setHealthId(String healthId) {
        this.healthId = healthId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }




}
