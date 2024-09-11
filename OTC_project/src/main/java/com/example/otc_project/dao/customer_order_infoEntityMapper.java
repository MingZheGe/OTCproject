package com.example.otc_project.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import com.example.otc_project.entity.customer_order_info;

import java.util.List;
import java.util.Map;

@Component
@Mapper
public interface customer_order_infoEntityMapper {


    //构成订单，包括买入、卖出、撤单订单，注意客户余额变化
    int insertCustomer_order_info(customer_order_info customerOrderInfo);

    List<customer_order_info> showCustomer_order_info();

    //用不到
    int updateOrderfinishamount(customer_order_info customerOrderInfo);


    //扫描状态为0、3、4的待处理订单，根据is_withdraw不同分为正常订单和撤单订单
    List<customer_order_info> selectStatus1();
    //点开此状态为0的订单将状态改为1，发送订单id
    int updateStatus1(customer_order_info customerOrderInfo);
    //点击确认将1改为2，即为已报，发送订单id
    int updataStatus2(customer_order_info customerOrderInfo);


    //扫描状态为2的订单，将状态改为7或8，此处需要将finish和amount进行对比
    int updateStatus8();

    int updatefinishamount(customer_order_info customerOrderInfo);



    //扫描某一acc_id下所有的订单，展示出来，按照时间排序，用于客户端查看自己的订单动态
    List<customer_order_info> showAccountOrder(customer_order_info customerOrderInfo);
    //搜索状态为8的订单，需要提取出account_id security_id position（amount*price），正数
    List<customer_order_info> show8order(customer_order_info customerOrderInfo);
    List<customer_order_info> show5order(customer_order_info customerOrderInfo);
    //扫描某一acc_id下的状态为8的订单，并将8改成-1，并调用持仓中的insert算法和group算法，此处是用于更新客户端的持仓信息
    int updateStatus0();


    //改为已报待撤订单和部成待撤订单
    int updateStatus34(customer_order_info customerOrderInfo);


     //0、2、7的可以撤单
    List<customer_order_info> judgeAccountwithdraw(customer_order_info customerOrderInfo);

    //将3改成6 将4改成5
    int updateStatus6(customer_order_info customerOrderInfo);


    //返回的是6的撤回amount*price的钱，返回是5的撤回（amount-finishamount）*price的钱
    customer_order_info withdrawMoney(customer_order_info customerOrderInfo);


}

