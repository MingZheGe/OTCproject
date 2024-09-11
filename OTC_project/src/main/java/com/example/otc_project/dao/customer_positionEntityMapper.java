package com.example.otc_project.dao;

import com.example.otc_project.entity.customer_position;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@Mapper
public interface customer_positionEntityMapper {

    //传入状态为8的已成订单，储存在客户后台中，此时状态为8并且是此acc_id下的订单，只需要传入sec_id和position金额，list形式
    int insertCustomer_position(List<customer_position> customerPosition);


    //根据此acc_id下的证券根据sec_id金额的聚合
    List<customer_position> groupcustomerAllposition(customer_position customerPosition);

    List<customer_position> showAccountposition(customer_position customerPosition);

    //删除原先的用户的数据
    int deleteAccountpostion(customer_position customer_position);

    //插入整合好的数据
    int insertGroupposition(List<customer_position> customerPositions);



}
