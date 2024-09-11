package com.example.otc_project.service;


import com.example.otc_project.dao.customer_order_infoEntityMapper;
import com.example.otc_project.entity.customer_order_info;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class customer_order_infoService {
    @Autowired
    private customer_order_infoEntityMapper customerOrderInfoEntityMapper;

    public int insertCustomer_order_info(customer_order_info customerOrderInfo){
        int result = customerOrderInfoEntityMapper.insertCustomer_order_info(customerOrderInfo);
        if(result!=0){
            return 3;
        }else {
            return result;
        }
    }

    public int updateOrderfinishamount(customer_order_info customerOrderInfo){
        int result = customerOrderInfoEntityMapper.updateOrderfinishamount(customerOrderInfo);
        if(result!=0){
            return 3;
        }else {
            return result;
        }
    }

    public List<customer_order_info> showCustomer_order_info(){
        List<customer_order_info> result = customerOrderInfoEntityMapper.showCustomer_order_info();

        return result;
    }

    public List<customer_order_info> show8order(customer_order_info customerOrderInfo){
        List<customer_order_info> result = customerOrderInfoEntityMapper.show8order(customerOrderInfo);

        return result;
    }


    public List<customer_order_info> selectStatus1(){
        List<customer_order_info> result = customerOrderInfoEntityMapper.selectStatus1();

        return result;
    }

    public int updateStatus1(customer_order_info customerOrderInfo){
        int result = customerOrderInfoEntityMapper.updateStatus1(customerOrderInfo);
        if(result!=0){
            return 3;
        }else {
            return result;
        }
    }

    public int updataStatus2(customer_order_info customerOrderInfo){
        int result = customerOrderInfoEntityMapper.updataStatus2(customerOrderInfo);
        if(result!=0){
            return 3;
        }else {
            return result;
        }
    }

    public int updataStatus8(){
        int result = customerOrderInfoEntityMapper.updateStatus8();
        if(result!=0){
            return 3;
        }else {
            return result;
        }
    }

    public int updateStatus34(customer_order_info customerOrderInfo){
        int result = customerOrderInfoEntityMapper.updateStatus34(customerOrderInfo);
        if(result!=0){
            return 3;
        }else {
            return result;
        }
    }

    public List<customer_order_info> showAccountOrder(customer_order_info customerOrderInfo){
        List<customer_order_info> result = customerOrderInfoEntityMapper.showAccountOrder(customerOrderInfo);

        return result;
    }

    public List<customer_order_info> judgeAccountwithdraw(customer_order_info customerOrderInfo){
        List<customer_order_info> result = customerOrderInfoEntityMapper.judgeAccountwithdraw(customerOrderInfo);

        return result;
    }

    public customer_order_info withdrawMoney(customer_order_info customerOrderInfo){
        customer_order_info result = customerOrderInfoEntityMapper.withdrawMoney(customerOrderInfo);
        return result;
    }

    public int updataStatus0(){
        int result = customerOrderInfoEntityMapper.updateStatus0();
        if(result!=0){
            return 3;
        }else {
            return result;
        }
    }

    public List<customer_order_info> show5order(customer_order_info customerOrderInfo){
        List<customer_order_info> result = customerOrderInfoEntityMapper.show5order(customerOrderInfo);

        return result;
    }


    public int updateStatus6(customer_order_info customerOrderInfo){
        int result = customerOrderInfoEntityMapper.updateStatus6(customerOrderInfo);
        if(result!=0){
            return 3;
        }else {
            return result;
        }
    }

    public int updatefinishamount(customer_order_info customerOrderInfo){
        int result = customerOrderInfoEntityMapper.updatefinishamount(customerOrderInfo);
        if(result!=0){
            return 3;
        }else {
            return result;
        }
    }
}
