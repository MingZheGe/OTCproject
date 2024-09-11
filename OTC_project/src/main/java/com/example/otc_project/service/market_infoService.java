package com.example.otc_project.service;

import com.example.otc_project.dao.market_infoEntityMapper;
import com.example.otc_project.entity.market_info;
import com.example.otc_project.entity.security_info;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class market_infoService {
    @Autowired
    private market_infoEntityMapper marketInfoEntityMapper;

    public List<market_info> showMarket_info(){
        List<market_info> result = marketInfoEntityMapper.showMarket_info();
        return result;
    }

    //List<market_info> searchMarket_info(market_info marketInfo);

    public List<market_info> searchMarket_info(market_info marketInfo){
        List<market_info> result = marketInfoEntityMapper.searchMarket_info(marketInfo);
        return result;
    }



}
