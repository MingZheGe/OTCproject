package com.example.otc_project.service;


import com.example.otc_project.dao.customer_positionEntityMapper;
import com.example.otc_project.entity.customer_order_info;
import com.example.otc_project.entity.customer_position;
import com.example.otc_project.entity.market_info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class customer_positionService {
    @Autowired
    private customer_positionEntityMapper customerPositionEntityMapper;

    //    //传入状态为8的已成订单，储存在客户后台中，此时状态为8并且是此acc_id下的订单，只需要传入sec_id和position金额，list形式
//    int insertCustomer_position(List<customer_position> customerPosition);
//
//
//    //根据此acc_id下的证券根据sec_id金额的聚合
//    List<customer_position> groupcustomerAllposition(customer_position customerPosition);
    public int insertCustomer_position(List<customer_position> customerPosition) {
        int result = customerPositionEntityMapper.insertCustomer_position(customerPosition);
        if (result != 0) {
            return 3;
        } else {
            return result;
        }
    }

    public List<customer_position> groupcustomerAllposition(customer_position customerPosition){
        List<customer_position> result = customerPositionEntityMapper.groupcustomerAllposition(customerPosition);
        return result;
    }

    public List<customer_position> showAccountposition(customer_position customerPosition){
        List<customer_position> result = customerPositionEntityMapper.showAccountposition(customerPosition);
        return result;
    }



    public int deleteAccountpostion(customer_position customerPosition) {
        int result = customerPositionEntityMapper.deleteAccountpostion(customerPosition);
        if (result != 0) {
            return 3;
        } else {
            return result;
        }
    }

    public int insertGroupposition(List<customer_position> customerPosition) {
        int result = customerPositionEntityMapper.insertGroupposition(customerPosition);
        if (result != 0) {
            return 3;
        } else {
            return result;
        }
    }


}
