package com.example.otc_project.dao;

import com.example.otc_project.entity.customer_opening_info;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@Mapper
public interface customer_opening_infoEntityMapper {
    int insertCustomer_opening_info(customer_opening_info customerOpeningInfo);

    List<customer_opening_info> showCustomer_opening_info();

    //发送金额改变
    int updateCustomer_rest(customer_opening_info customerOpeningInfo);

    int updateCustomer_SH_info(customer_opening_info customerOpeningInfo);

    int updateCustomer_SZ_info(customer_opening_info customerOpeningInfo);

    customer_opening_info searchCustomer(customer_opening_info customer_opening_info);
}
