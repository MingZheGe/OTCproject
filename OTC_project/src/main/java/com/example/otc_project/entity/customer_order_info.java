package com.example.otc_project.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class customer_order_info implements Serializable{
    private String order_id;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",  timezone = "GMT+8")
    private Date order_time;
    private String account_id;
    private String security_id;
    private int amount;
    private int finishamount;
    private float price;
    private String trd_id;
    private String order_status;
    private String currency;
    private String is_withdraw;
    private String stk_cls;

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public Date getOrder_time() {
        return order_time;
    }

    public void setOrder_time(Date order_time) {
        this.order_time = order_time;
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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getFinishamount() {
        return finishamount;
    }

    public void setFinishamount(int finishamount) {
        this.finishamount = finishamount;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getTrd_id() {
        return trd_id;
    }

    public void setTrd_id(String trd_id) {
        this.trd_id = trd_id;
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getIs_withdraw() {
        return is_withdraw;
    }

    public void setIs_withdraw(String is_withdraw) {
        this.is_withdraw = is_withdraw;
    }

    public String getStk_cls() {
        return stk_cls;
    }

    public void setStk_cls(String stk_cls) {
        this.stk_cls = stk_cls;
    }

    @Override
    public String toString() {
        return "customer_order_info{" +
                "order_id='" + order_id + '\'' +
                ", order_time=" + order_time +
                ", account_id='" + account_id + '\'' +
                ", security_id='" + security_id + '\'' +
                ", amount=" + amount +
                ", finishamount=" + finishamount +
                ", price=" + price +
                ", trd_id='" + trd_id + '\'' +
                ", order_status='" + order_status + '\'' +
                ", currency='" + currency + '\'' +
                ", is_withdraw='" + is_withdraw + '\'' +
                ", stk_cls='" + stk_cls + '\'' +
                '}';
    }
}
