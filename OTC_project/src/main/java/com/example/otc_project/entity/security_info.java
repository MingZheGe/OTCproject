package com.example.otc_project.entity;

import java.io.Serializable;
public class security_info implements Serializable{
    private String market;
    private String security_id;
    private String security_name;
    private String security_type;
    private float stamp_duty_rate;

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
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

    public String getSecurity_type() {
        return security_type;
    }

    public void setSecurity_type(String security_type) {
        this.security_type = security_type;
    }

    public float getStamp_duty_rate() {
        return stamp_duty_rate;
    }

    public void setStamp_duty_rate(float stamp_duty_rate) {
        this.stamp_duty_rate = stamp_duty_rate;
    }

    @Override
    public String toString() {
        return "security_info{" +
                "market='" + market + '\'' +
                ", security_id='" + security_id + '\'' +
                ", security_name='" + security_name + '\'' +
                ", security_type='" + security_type + '\'' +
                ", stamp_duty_rate=" + stamp_duty_rate +
                '}';
    }
}
