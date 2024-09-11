package com.example.otc_project.dao;

import com.example.otc_project.entity.market_info;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@Mapper
public interface market_infoEntityMapper {
    List<market_info> showMarket_info();

    List<market_info> searchMarket_info(market_info marketInfo);
}
