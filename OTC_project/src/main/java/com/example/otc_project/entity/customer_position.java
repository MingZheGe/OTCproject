package com.example.otc_project.entity;
import java.io.Serializable;
public class customer_position implements Serializable{

    private String account_id;
    private String security_id;
    private String security_name;

    private float position;
    private int amount;


    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public String getSecurity_id() {
        return security_id;
    }

    public void setSecurity_id(String security_id) {
        this.security_id = security_id;
    }

    public String getSecurity_name() {
        return security_name;
    }

    public void setSecurity_name(String security_name) {
        this.security_name = security_name;
    }

    public float getPosition() {
        return position;
    }

    public void setPosition(float position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "customer_position{" +
                "account_id='" + account_id + '\'' +
                ", security_id='" + security_id + '\'' +
                ", security_name='" + security_name + '\'' +
                ", amount='" + amount + '\'' +
                ", position=" + position +
                '}';
    }
}
