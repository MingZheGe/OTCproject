package com.example.otc_project.service;

import com.example.otc_project.dao.customer_opening_infoEntityMapper;
import com.example.otc_project.entity.customer_opening_info;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class customer_opening_infoService {
    @Autowired
    private customer_opening_infoEntityMapper customerOpeningInfoEntityMapper;

    public int insertCustomer_opening_info(customer_opening_info customerOpeningInfo){
        int result = customerOpeningInfoEntityMapper.insertCustomer_opening_info(customerOpeningInfo);
        if(result!=0){
            return 3;
        }else {
            return result;
        }
    }

    public List<customer_opening_info> showCustomer_opening_info(){
        List<customer_opening_info> result = customerOpeningInfoEntityMapper.showCustomer_opening_info();

        return result;
    }

    public customer_opening_info searchCustomer(customer_opening_info customer_opening_info){
        customer_opening_info result = customerOpeningInfoEntityMapper.searchCustomer(customer_opening_info);

        return result;
    }


    public int updateCustomer_rest(customer_opening_info customerOpeningInfo){
        int result = customerOpeningInfoEntityMapper.updateCustomer_rest(customerOpeningInfo);
        if(result!=0){
            return 3;
        }else {
            return result;
        }
    }

    public int updateCustomer_SZ_info(customer_opening_info customerOpeningInfo){
        int result = customerOpeningInfoEntityMapper.updateCustomer_SZ_info(customerOpeningInfo);
        if(result!=0){
            return 3;
        }else {
            return result;
        }
    }

    public int updateCustomer_SH_info(customer_opening_info customerOpeningInfo){
        int result = customerOpeningInfoEntityMapper.updateCustomer_SH_info(customerOpeningInfo);
        if(result!=0){
            return 3;
        }else {
            return result;
        }
    }





}
