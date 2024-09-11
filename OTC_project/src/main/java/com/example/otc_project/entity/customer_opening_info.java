package com.example.otc_project.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;

public class customer_opening_info implements Serializable{
    private String account_id;
    private String account_name;
    private String id_type;
    private String id_number;
    private String cuacct_cls;
    private String sh_security_account;
    private String sz_security_account;

    private float customer_rest;
    private String cuacct_status;

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public String getAccount_name() {
        return account_name;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    public String getId_type() {
        return id_type;
    }

    public void setId_type(String id_type) {
        this.id_type = id_type;
    }

    public String getId_number() {
        return id_number;
    }

    public void setId_number(String id_number) {
        this.id_number = id_number;
    }

    public String getCuacct_cls() {
        return cuacct_cls;
    }

    public void setCuacct_cls(String cuacct_cls) {
        this.cuacct_cls = cuacct_cls;
    }

    public String getSh_security_account() {
        return sh_security_account;
    }

    public void setSh_security_account(String sh_security_account) {
        this.sh_security_account = sh_security_account;
    }

    public String getSz_security_account() {
        return sz_security_account;
    }

    public void setSz_security_account(String sz_security_account) {
        this.sz_security_account = sz_security_account;
    }

    public float getCustomer_rest() {
        return customer_rest;
    }

    public void setCustomer_rest(float customer_rest) {
        this.customer_rest = customer_rest;
    }

    public String getCuacct_status() {
        return cuacct_status;
    }

    public void setCuacct_status(String cuacct_status) {
        this.cuacct_status = cuacct_status;
    }

    @Override
    public String toString() {
        return "customer_opening_info{" +
                "account_id=" + account_id +
                ", account_name='" + account_name + '\'' +
                ", id_type='" + id_type + '\'' +
                ", id_number='" + id_number + '\'' +
                ", cuacct_cls='" + cuacct_cls + '\'' +
                ", sh_security_account='" + sh_security_account + '\'' +
                ", sz_security_account='" + sz_security_account + '\'' +
                ", customer_rest=" + customer_rest +
                ", cuacct_status='" + cuacct_status + '\'' +
                '}';
    }
}
