package com.example.otc_project.entity;
import java.io.Serializable;
public class market_info implements Serializable{
    private String security_id;
    private float current_price;
    private float yes_col_price;
    private float limit_up_price;
    private float limit_down_price;

    public String getSecurity_id() {
        return security_id;
    }

    public void setSecurity_id(String security_id) {
        this.security_id = security_id;
    }

    public float getCurrent_price() {
        return current_price;
    }

    public void setCurrent_price(float current_price) {
        this.current_price = current_price;
    }

    public float getYes_col_price() {
        return yes_col_price;
    }

    public void setYes_col_price(float yes_col_price) {
        this.yes_col_price = yes_col_price;
    }

    public float getLimit_up_price() {
        return limit_up_price;
    }

    public void setLimit_up_price(float limit_up_price) {
        this.limit_up_price = limit_up_price;
    }

    public float getLimit_down_price() {
        return limit_down_price;
    }

    public void setLimit_down_price(float limit_down_price) {
        this.limit_down_price = limit_down_price;
    }

    @Override
    public String toString() {
        return "market_info{" +
                "security_id='" + security_id + '\'' +
                ", current_price=" + current_price +
                ", yes_col_price=" + yes_col_price +
                ", limit_up_price=" + limit_up_price +
                ", limit_down_price=" + limit_down_price +
                '}';
    }
}
