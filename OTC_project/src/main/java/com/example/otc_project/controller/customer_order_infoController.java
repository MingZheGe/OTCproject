package com.example.otc_project.controller;


import com.example.otc_project.bean.HttpResponseEntity;
import com.example.otc_project.entity.customer_order_info;
import com.example.otc_project.service.customer_order_infoService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class customer_order_infoController {
    @Autowired
    private customer_order_infoService customerOrderInfoService;


    @RequestMapping("/insertCustomer_order_info")
    public HttpResponseEntity insertCustomer_order_info(@RequestBody customer_order_info customerOrderInfo){
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        try {
            int result = customerOrderInfoService.insertCustomer_order_info(customerOrderInfo);
            if (result !=0 ) {
                httpResponseEntity.setCode("666");
                httpResponseEntity.setData(result);
                httpResponseEntity.setMessage("success");
            } else {
                httpResponseEntity.setCode("0");
                httpResponseEntity.setData(0);
                httpResponseEntity.setMessage("fail");
            }

        } catch (Exception e) {
            //System.out.println(e.getMessage());
            e.printStackTrace();
            httpResponseEntity.setCode("500"); // Internal server error
            httpResponseEntity.setMessage("An error occurred");
        }
        return httpResponseEntity;
    }

    @RequestMapping("/showCustomer_order_info")
    public HttpResponseEntity showCustomer_order_info(){
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        try {
            List<customer_order_info> result = customerOrderInfoService.showCustomer_order_info();
            if (result !=null ) {
                httpResponseEntity.setCode("666");
                httpResponseEntity.setData(result);
                httpResponseEntity.setMessage("success");
            } else {
                httpResponseEntity.setCode("0");
                httpResponseEntity.setData(0);
                httpResponseEntity.setMessage("fail");
            }

        } catch (Exception e) {
            //System.out.println(e.getMessage());
            e.printStackTrace();
            httpResponseEntity.setCode("500"); // Internal server error
            httpResponseEntity.setMessage("An error occurred");
        }
        return httpResponseEntity;
    }

    @RequestMapping("/updateStatus6")
    public HttpResponseEntity updateStatus6(@RequestBody customer_order_info customerOrderInfo){
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        try {
            int result = customerOrderInfoService.updateStatus6(customerOrderInfo);
            if (result !=0 ) {
                httpResponseEntity.setCode("666");
                httpResponseEntity.setData(result);
                httpResponseEntity.setMessage("success");
            } else {
                httpResponseEntity.setCode("0");
                httpResponseEntity.setData(0);
                httpResponseEntity.setMessage("fail");
            }

        } catch (Exception e) {
            //System.out.println(e.getMessage());
            e.printStackTrace();
            httpResponseEntity.setCode("500"); // Internal server error
            httpResponseEntity.setMessage("An error occurred");
        }
        return httpResponseEntity;
    }

    @RequestMapping("/updateStatus0")
    public HttpResponseEntity updateStatus0(){
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        try {
            int result = customerOrderInfoService.updataStatus0();
            if (result !=0 ) {
                httpResponseEntity.setCode("666");
                httpResponseEntity.setData(result);
                httpResponseEntity.setMessage("success");
            } else {
                httpResponseEntity.setCode("0");
                httpResponseEntity.setData(0);
                httpResponseEntity.setMessage("fail");
            }

        } catch (Exception e) {
            //System.out.println(e.getMessage());
            e.printStackTrace();
            httpResponseEntity.setCode("500"); // Internal server error
            httpResponseEntity.setMessage("An error occurred");
        }
        return httpResponseEntity;
    }

    @RequestMapping("/showAccountOrder")
    public HttpResponseEntity showAccountOrder(@RequestBody customer_order_info customerOrderInfo){
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        try {
            List<customer_order_info> result = customerOrderInfoService.showAccountOrder(customerOrderInfo);
            if (result !=null ) {
                httpResponseEntity.setCode("666");
                httpResponseEntity.setData(result);
                httpResponseEntity.setMessage("success");
            } else {
                httpResponseEntity.setCode("0");
                httpResponseEntity.setData(0);
                httpResponseEntity.setMessage("fail");
            }

        } catch (Exception e) {
            //System.out.println(e.getMessage());
            e.printStackTrace();
            httpResponseEntity.setCode("500"); // Internal server error
            httpResponseEntity.setMessage("An error occurred");
        }
        return httpResponseEntity;
    }

    @RequestMapping("/show8order")
    public HttpResponseEntity show8order(@RequestBody customer_order_info customerOrderInfo){
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        try {
            List<customer_order_info> result = customerOrderInfoService.show8order(customerOrderInfo);

            if (result !=null ) {
                httpResponseEntity.setCode("666");
                httpResponseEntity.setData(result);
                httpResponseEntity.setMessage("success");
            } else {
                httpResponseEntity.setCode("0");
                httpResponseEntity.setData(0);
                httpResponseEntity.setMessage("fail");
            }

        } catch (Exception e) {
            //System.out.println(e.getMessage());
            e.printStackTrace();
            httpResponseEntity.setCode("500"); // Internal server error
            httpResponseEntity.setMessage("An error occurred");
        }
        return httpResponseEntity;
    }

    @RequestMapping("/updateStatus8")
    public HttpResponseEntity updateStatus8(){
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        try {
            int result = customerOrderInfoService.updataStatus8();
            if (result !=0 ) {
                httpResponseEntity.setCode("666");
                httpResponseEntity.setData(result);
                httpResponseEntity.setMessage("success");
            } else {
                httpResponseEntity.setCode("0");
                httpResponseEntity.setData(0);
                httpResponseEntity.setMessage("fail");
            }

        } catch (Exception e) {
            //System.out.println(e.getMessage());
            e.printStackTrace();
            httpResponseEntity.setCode("500"); // Internal server error
            httpResponseEntity.setMessage("An error occurred");
        }
        return httpResponseEntity;
    }

    @RequestMapping("/updataStatus2")
    public HttpResponseEntity updataStatus2(@RequestBody customer_order_info customerOrderInfo){
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        try {
            int result = customerOrderInfoService.updataStatus2(customerOrderInfo);
            if (result !=0 ) {
                httpResponseEntity.setCode("666");
                httpResponseEntity.setData(result);
                httpResponseEntity.setMessage("success");
            } else {
                httpResponseEntity.setCode("0");
                httpResponseEntity.setData(0);
                httpResponseEntity.setMessage("fail");
            }

        } catch (Exception e) {
            //System.out.println(e.getMessage());
            e.printStackTrace();
            httpResponseEntity.setCode("500"); // Internal server error
            httpResponseEntity.setMessage("An error occurred");
        }
        return httpResponseEntity;
    }

    @RequestMapping("/updateStatus1")
    public HttpResponseEntity updateStatus1(@RequestBody customer_order_info customerOrderInfo){
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        try {
            int result = customerOrderInfoService.updateStatus1(customerOrderInfo);
            if (result !=0 ) {
                httpResponseEntity.setCode("666");
                httpResponseEntity.setData(result);
                httpResponseEntity.setMessage("success");
            } else {
                httpResponseEntity.setCode("0");
                httpResponseEntity.setData(0);
                httpResponseEntity.setMessage("fail");
            }

        } catch (Exception e) {
            //System.out.println(e.getMessage());
            e.printStackTrace();
            httpResponseEntity.setCode("500"); // Internal server error
            httpResponseEntity.setMessage("An error occurred");
        }
        return httpResponseEntity;
    }

    @RequestMapping("/selectStatus0")
    public HttpResponseEntity selectStatus1(){
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        try {
            List<customer_order_info> result = customerOrderInfoService.selectStatus1();
            if (result !=null ) {
                httpResponseEntity.setCode("666");
                httpResponseEntity.setData(result);
                httpResponseEntity.setMessage("success");
            } else {
                httpResponseEntity.setCode("0");
                httpResponseEntity.setData(0);
                httpResponseEntity.setMessage("fail");
            }

        } catch (Exception e) {
            //System.out.println(e.getMessage());
            e.printStackTrace();
            httpResponseEntity.setCode("500"); // Internal server error
            httpResponseEntity.setMessage("An error occurred");
        }
        return httpResponseEntity;
    }

    @RequestMapping("/updateOrderfinishamount")
    public HttpResponseEntity updateOrderfinishamount(@RequestBody customer_order_info customerOrderInfo){
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        try {
            int result = customerOrderInfoService.updateOrderfinishamount(customerOrderInfo);
            if (result !=0 ) {
                httpResponseEntity.setCode("666");
                httpResponseEntity.setData(result);
                httpResponseEntity.setMessage("success");
            } else {
                httpResponseEntity.setCode("0");
                httpResponseEntity.setData(0);
                httpResponseEntity.setMessage("fail");
            }

        } catch (Exception e) {
            //System.out.println(e.getMessage());
            e.printStackTrace();
            httpResponseEntity.setCode("500"); // Internal server error
            httpResponseEntity.setMessage("An error occurred");
        }
        return httpResponseEntity;
    }

    @RequestMapping("/updateStatus34")
    public HttpResponseEntity updateStatus34(@RequestBody customer_order_info customerOrderInfo){
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        try {
            int result = customerOrderInfoService.updateStatus34(customerOrderInfo);
            if (result !=0 ) {
                httpResponseEntity.setCode("666");
                httpResponseEntity.setData(result);
                httpResponseEntity.setMessage("success");
            } else {
                httpResponseEntity.setCode("0");
                httpResponseEntity.setData(0);
                httpResponseEntity.setMessage("fail");
            }

        } catch (Exception e) {
            //System.out.println(e.getMessage());
            e.printStackTrace();
            httpResponseEntity.setCode("500"); // Internal server error
            httpResponseEntity.setMessage("An error occurred");
        }
        return httpResponseEntity;
    }

    @RequestMapping("/judgeAccountwithdraw")
    public HttpResponseEntity judgeAccountwithdraw(@RequestBody customer_order_info customerOrderInfo){
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        try {
            List<customer_order_info> result = customerOrderInfoService.judgeAccountwithdraw(customerOrderInfo);

            if (result !=null ) {
                httpResponseEntity.setCode("666");
                httpResponseEntity.setData(result);
                httpResponseEntity.setMessage("success");
            } else {
                httpResponseEntity.setCode("0");
                httpResponseEntity.setData(0);
                httpResponseEntity.setMessage("fail");
            }

        } catch (Exception e) {
            //System.out.println(e.getMessage());
            e.printStackTrace();
            httpResponseEntity.setCode("500"); // Internal server error
            httpResponseEntity.setMessage("An error occurred");
        }
        return httpResponseEntity;
    }

    @RequestMapping("/withdrawMoney")
    public HttpResponseEntity withdrawMoney(@RequestBody customer_order_info customerOrderInfo){
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        try {
            customer_order_info result = customerOrderInfoService.withdrawMoney(customerOrderInfo);

            if (result !=null ) {
                httpResponseEntity.setCode("666");
                httpResponseEntity.setData(result);
                httpResponseEntity.setMessage("success");
            } else {
                httpResponseEntity.setCode("0");
                httpResponseEntity.setData(0);
                httpResponseEntity.setMessage("fail");
            }

        } catch (Exception e) {
            //System.out.println(e.getMessage());
            e.printStackTrace();
            httpResponseEntity.setCode("500"); // Internal server error
            httpResponseEntity.setMessage("An error occurred");
        }
        return httpResponseEntity;
    }

    @RequestMapping("/show5order")
    public HttpResponseEntity show5order(@RequestBody customer_order_info customerOrderInfo){
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        try {
            List<customer_order_info> result = customerOrderInfoService.show5order(customerOrderInfo);

            if (result !=null ) {
                httpResponseEntity.setCode("666");
                httpResponseEntity.setData(result);
                httpResponseEntity.setMessage("success");
            } else {
                httpResponseEntity.setCode("0");
                httpResponseEntity.setData(0);
                httpResponseEntity.setMessage("fail");
            }

        } catch (Exception e) {
            //System.out.println(e.getMessage());
            e.printStackTrace();
            httpResponseEntity.setCode("500"); // Internal server error
            httpResponseEntity.setMessage("An error occurred");
        }
        return httpResponseEntity;
    }

    @RequestMapping("/updatefinishamount")
    public HttpResponseEntity updatefinishamount(@RequestBody customer_order_info customerOrderInfo){
        HttpResponseEntity httpResponseEntity = new HttpResponseEntity();
        try {
            int result = customerOrderInfoService.updatefinishamount(customerOrderInfo);

            if (result !=0 ) {
                httpResponseEntity.setCode("666");
                httpResponseEntity.setData(result);
                httpResponseEntity.setMessage("success");
            } else {
                httpResponseEntity.setCode("0");
                httpResponseEntity.setData(0);
                httpResponseEntity.setMessage("fail");
            }

        } catch (Exception e) {
            //System.out.println(e.getMessage());
            e.printStackTrace();
            httpResponseEntity.setCode("500"); // Internal server error
            httpResponseEntity.setMessage("An error occurred");
        }
        return httpResponseEntity;
    }



}
