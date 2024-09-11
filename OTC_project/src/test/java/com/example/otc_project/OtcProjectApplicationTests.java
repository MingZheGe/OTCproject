package com.example.otc_project;


import com.example.otc_project.dao.*;
import com.example.otc_project.entity.*;
import com.sun.org.apache.xerces.internal.xs.datatypes.ObjectList;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.util.CollectionUtils;


import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;


@SpringBootTest
class OtcProjectApplicationTests {
    Logger log = Logger.getLogger(String.valueOf(OtcProjectApplicationTests.class));

    //@Test
    public void login() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建UserMapper对象，mybatis自动生成mapper代理对象
        userEntityMapper userEntityMapper = sqlSession.getMapper(userEntityMapper.class);
        //调用userMapper的方法
        user user = new user();
        user.setUsername("root");
        user.setPassword("123");
        user = userEntityMapper.login(user);
        if(user == null){
            log.info(">>登录方法测试成功");
            // 记录error级别的信息
        }else{
            System.out.println(user);
            System.out.println("hahaha");
            // 记录info级别的信息
            log.info(">>登录方法测试失败");
        }
    }

    @Test
    public void register() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建UserMapper对象，mybatis自动生成mapper代理对象
        userEntityMapper userEntityMapper = sqlSession.getMapper(userEntityMapper.class);
        //调用userMapper的方法
        user user = new user();
        user.setUsername("1024");
        user.setPassword("123");
        int result = userEntityMapper.register(user);
        if(result != 0){
            log.info(">>注册方法测试成功");
            // 记录error级别的信息
        }else{
            log.info(">>注册方法测试失败");
        }
    }

    //@Test
    public void updatePassword() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建UserMapper对象，mybatis自动生成mapper代理对象
        userEntityMapper userEntityMapper = sqlSession.getMapper(userEntityMapper.class);
        //调用userMapper的方法
        user user = new user();
        user.setUsername("1024");
        user.setPassword("123");
        int result = userEntityMapper.updatePassword(user);
        if(result != 0){
            log.info(">>修改密码方法测试成功");
            // 记录error级别的信息
        }else{
            log.info(">>修改密码方法测试失败");
        }
    }

    //@Test
    public void insertCustomer_opening_info() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建UserMapper对象，mybatis自动生成mapper代理对象
        customer_opening_infoEntityMapper customerOpeningInfoEntityMapper = sqlSession.getMapper(customer_opening_infoEntityMapper.class);
        //调用userMapper的方法
        customer_opening_info customerOpeningInfo = new customer_opening_info();
        customerOpeningInfo.setAccount_id("2577");
        customerOpeningInfo.setAccount_name("李四");
        customerOpeningInfo.setId_type("00");
        customerOpeningInfo.setId_number("371728200807160028");
        customerOpeningInfo.setCuacct_cls("1");
        customerOpeningInfo.setSh_security_account("1000236748");
        customerOpeningInfo.setSz_security_account("6000293745");
        customerOpeningInfo.setCustomer_rest(80000);
        customerOpeningInfo.setCuacct_status("0");
        int result = customerOpeningInfoEntityMapper.insertCustomer_opening_info(customerOpeningInfo);

        if(result != 0){
            log.info(">>开户方法测试成功");
            // 记录error级别的信息
        }else{
            log.info(">>开户方法测试失败");
        }
    }

    //@Test
    public void showCustomer_opening_info() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建UserMapper对象，mybatis自动生成mapper代理对象
        customer_opening_infoEntityMapper customerOpeningInfoEntityMapper = sqlSession.getMapper(customer_opening_infoEntityMapper.class);
        //调用userMapper的方法
        List<customer_opening_info> result = customerOpeningInfoEntityMapper.showCustomer_opening_info();

        if(result != null){
            log.info(">>查看订单方法测试成功");
            // 记录error级别的信息
        }else{
            log.info(">>查看订单方法测试失败");
        }
    }

    //@Test
    public void updateCustomer_rest() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建UserMapper对象，mybatis自动生成mapper代理对象
        customer_opening_infoEntityMapper customerOpeningInfoEntityMapper = sqlSession.getMapper(customer_opening_infoEntityMapper.class);
        //调用userMapper的方法
        customer_opening_info customerOpeningInfo = new customer_opening_info();
        customerOpeningInfo.setAccount_id("2576");
        customerOpeningInfo.setCustomer_rest(80001);
        int result = customerOpeningInfoEntityMapper.updateCustomer_rest(customerOpeningInfo);

        if(result != 0){
            log.info(">>更新用户余额方法测试成功");
            // 记录error级别的信息
        }else{
            log.info(">>更新用户余额方法测试失败");
        }
    }

    //@Test
    public void updateCustomer_SZ_info() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建UserMapper对象，mybatis自动生成mapper代理对象
        customer_opening_infoEntityMapper customerOpeningInfoEntityMapper = sqlSession.getMapper(customer_opening_infoEntityMapper.class);
        //调用userMapper的方法
        customer_opening_info customerOpeningInfo = new customer_opening_info();
        customerOpeningInfo.setAccount_id("2576");
        customerOpeningInfo.setSz_security_account("6000293745");
        int result = customerOpeningInfoEntityMapper.updateCustomer_SZ_info(customerOpeningInfo);

        if(result != 0){
            log.info(">>更新深交所账号方法测试成功");
            // 记录error级别的信息
        }else{
            log.info(">>更新深交所账号方法测试失败");
        }
    }

    //@Test
    public void updateCustomer_SH_info() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建UserMapper对象，mybatis自动生成mapper代理对象
        customer_opening_infoEntityMapper customerOpeningInfoEntityMapper = sqlSession.getMapper(customer_opening_infoEntityMapper.class);
        //调用userMapper的方法
        customer_opening_info customerOpeningInfo = new customer_opening_info();
        customerOpeningInfo.setAccount_id("2576");
        customerOpeningInfo.setSh_security_account("1000236741");
        int result = customerOpeningInfoEntityMapper.updateCustomer_SH_info(customerOpeningInfo);

        if(result != 0){
            log.info(">>更新上交所账号方法测试成功");
            // 记录error级别的信息
        }else{
            log.info(">>更新上交所账号方法测试失败");
        }
    }

    //@Test
    public void searchCustomer() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建UserMapper对象，mybatis自动生成mapper代理对象
        customer_opening_infoEntityMapper customerOpeningInfoEntityMapper = sqlSession.getMapper(customer_opening_infoEntityMapper.class);
        //调用userMapper的方法
        customer_opening_info customerOpeningInfo = new customer_opening_info();
        customerOpeningInfo.setAccount_id("2576");
        customer_opening_info result = customerOpeningInfoEntityMapper.searchCustomer(customerOpeningInfo);

        if(result != null){
            log.info(">>查看订单方法测试成功");
            // 记录error级别的信息
        }else{
            log.info(">>查看订单方法测试失败");
        }
    }

    //@Test
    public void insertCustomer_order_info() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建UserMapper对象，mybatis自动生成mapper代理对象
        customer_order_infoEntityMapper customerOrderInfoEntityMapper = sqlSession.getMapper(customer_order_infoEntityMapper.class);
        //调用userMapper的方法
        customer_order_info customerOrderInfo = new customer_order_info();
        customerOrderInfo.setOrder_id("1018891");
        customerOrderInfo.setOrder_time(null);
        customerOrderInfo.setAccount_id("1026");
        customerOrderInfo.setSecurity_id("000001");
        customerOrderInfo.setAmount(70);
        customerOrderInfo.setPrice(9);
        customerOrderInfo.setTrd_id("B");
        customerOrderInfo.setOrder_status("0");
        customerOrderInfo.setCurrency("2");
        customerOrderInfo.setIs_withdraw("F");
        customerOrderInfo.setStk_cls("S0");
        int result = customerOrderInfoEntityMapper.insertCustomer_order_info(customerOrderInfo);

        if(result != 0){
            log.info(">>生成订单方法测试成功");
            // 记录error级别的信息
        }else{
            log.info(">>生成订单方法测试失败");
        }
    }

    //@Test
    public void showCustomer_order_info() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建UserMapper对象，mybatis自动生成mapper代理对象
        customer_order_infoEntityMapper customerOrderInfoEntityMapper = sqlSession.getMapper(customer_order_infoEntityMapper.class);
        //调用userMapper的方法

        List<customer_order_info> result = customerOrderInfoEntityMapper.showCustomer_order_info();

        if(result != null){
            log.info(">>查看订单方法测试成功");
            // 记录error级别的信息
        }else{
            log.info(">>查看订单方法测试失败");
        }
    }

    //@Test
    public void showAccountOrder() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建UserMapper对象，mybatis自动生成mapper代理对象
        customer_order_infoEntityMapper customerOrderInfoEntityMapper = sqlSession.getMapper(customer_order_infoEntityMapper.class);
        //调用userMapper的方法
        customer_order_info customerOrderInfo = new customer_order_info();
        customerOrderInfo.setAccount_id("1024");
        List<customer_order_info> result = customerOrderInfoEntityMapper.showAccountOrder(customerOrderInfo);

        if(result != null){
            log.info(">>查看客户订单方法测试成功");
            // 记录error级别的信息
        }else{
            log.info(">>查看客户订单方法测试失败");
        }
    }

    //@Test
    public void selectStatus0() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建UserMapper对象，mybatis自动生成mapper代理对象
        customer_order_infoEntityMapper customerOrderInfoEntityMapper = sqlSession.getMapper(customer_order_infoEntityMapper.class);
        //调用userMapper的方法
//        customer_order_info customerOrderInfo = new customer_order_info();
//        customerOrderInfo.setAccount_id("1024");
        List<customer_order_info> result = customerOrderInfoEntityMapper.selectStatus1();

        if(result != null){
            log.info(">>查看待办订单方法测试成功");
            // 记录error级别的信息
        }else{
            log.info(">>查看待办订单方法测试失败");
        }
    }

    //@Test
    public void updateStatus1() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建UserMapper对象，mybatis自动生成mapper代理对象
        customer_order_infoEntityMapper customerOrderInfoEntityMapper = sqlSession.getMapper(customer_order_infoEntityMapper.class);
        //调用userMapper的方法
        customer_order_info customerOrderInfo = new customer_order_info();
        customerOrderInfo.setOrder_id("1018891");
        int result = customerOrderInfoEntityMapper.updateStatus1(customerOrderInfo);

        if(result != 0){
            log.info(">>更新订单状态为正报方法测试成功");
            // 记录error级别的信息
        }else{
            log.info(">>更新订单状态为正报方法测试失败");
        }
    }

    //@Test
    public void updateStatus2() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建UserMapper对象，mybatis自动生成mapper代理对象
        customer_order_infoEntityMapper customerOrderInfoEntityMapper = sqlSession.getMapper(customer_order_infoEntityMapper.class);
        //调用userMapper的方法
        customer_order_info customerOrderInfo = new customer_order_info();
        customerOrderInfo.setOrder_id("1018891");
        customerOrderInfo.setFinishamount(30);
        int result = customerOrderInfoEntityMapper.updataStatus2(customerOrderInfo);

        if(result != 0){
            log.info(">>更新订单状态为已报方法测试成功");
            // 记录error级别的信息
        }else{
            log.info(">>更新订单状态为已报方法测试失败");
        }
    }

    //@Test
    public void updateStatus8() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建UserMapper对象，mybatis自动生成mapper代理对象
        customer_order_infoEntityMapper customerOrderInfoEntityMapper = sqlSession.getMapper(customer_order_infoEntityMapper.class);
        //调用userMapper的方法
        int result = customerOrderInfoEntityMapper.updateStatus8();

        if(result != 0){
            log.info(">>订单状态部成、已成更新测试成功");
            // 记录error级别的信息
        }else{
            log.info(">>订单状态部成、已成更新测试失败");
        }
    }

    //@Test
    public void show8order() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建UserMapper对象，mybatis自动生成mapper代理对象
        customer_order_infoEntityMapper customerOrderInfoEntityMapper = sqlSession.getMapper(customer_order_infoEntityMapper.class);
        //调用userMapper的方法
        customer_order_info customerOrderInfo = new customer_order_info();
        customerOrderInfo.setAccount_id("1024");
        List<customer_order_info> result = customerOrderInfoEntityMapper.show8order(customerOrderInfo);

        if(result != null){
            log.info(">>查找已成订单测试成功");
            // 记录error级别的信息
        }else{
            log.info(">>查找已成订单测试失败");
        }
    }

    //@Test
    public void show5order() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建UserMapper对象，mybatis自动生成mapper代理对象
        customer_order_infoEntityMapper customerOrderInfoEntityMapper = sqlSession.getMapper(customer_order_infoEntityMapper.class);
        //调用userMapper的方法
        customer_order_info customerOrderInfo = new customer_order_info();
        customerOrderInfo.setAccount_id("1024");
        List<customer_order_info> result = customerOrderInfoEntityMapper.show5order(customerOrderInfo);

        if(result != null){
            log.info(">>查找部撤订单测试成功");
            // 记录error级别的信息
        }else{
            log.info(">>查找部撤订单测试失败");
        }
    }

    //@Test
    public void updateStatus0() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建UserMapper对象，mybatis自动生成mapper代理对象
        customer_order_infoEntityMapper customerOrderInfoEntityMapper = sqlSession.getMapper(customer_order_infoEntityMapper.class);
        //调用userMapper的方法
        int result = customerOrderInfoEntityMapper.updateStatus0();

        if(result != 0){
            log.info(">>已成订单变成废单测试成功");
            // 记录error级别的信息
        }else{
            log.info(">>已成订单变成废单测试失败");
        }
    }

    //@Test
    public void updateStatus34() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建UserMapper对象，mybatis自动生成mapper代理对象
        customer_order_infoEntityMapper customerOrderInfoEntityMapper = sqlSession.getMapper(customer_order_infoEntityMapper.class);
        //调用userMapper的方法
        customer_order_info customerOrderInfo = new customer_order_info();
        customerOrderInfo.setOrder_id("1018891");
        int result = customerOrderInfoEntityMapper.updateStatus34(customerOrderInfo);

        if(result != 0){
            log.info(">>撤单测试成功");
            // 记录error级别的信息
        }else{
            log.info(">>撤单测试失败");
        }
    }

    //@Test
    public void judgeAccountwithdraw() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建UserMapper对象，mybatis自动生成mapper代理对象
        customer_order_infoEntityMapper customerOrderInfoEntityMapper = sqlSession.getMapper(customer_order_infoEntityMapper.class);
        //调用userMapper的方法
        customer_order_info customerOrderInfo = new customer_order_info();
        customerOrderInfo.setOrder_id("1018891");
        List<customer_order_info> result = customerOrderInfoEntityMapper.judgeAccountwithdraw(customerOrderInfo);

        if(result != null){
            log.info(">>筛选可撤单订单测试成功");
            // 记录error级别的信息
        }else{
            log.info(">>筛选可撤单订单测试失败");
        }
    }

    //@Test
    public void updateStatus6() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建UserMapper对象，mybatis自动生成mapper代理对象
        customer_order_infoEntityMapper customerOrderInfoEntityMapper = sqlSession.getMapper(customer_order_infoEntityMapper.class);
        //调用userMapper的方法
        customer_order_info customerOrderInfo = new customer_order_info();
        customerOrderInfo.setOrder_id("1018891");
        int result = customerOrderInfoEntityMapper.updateStatus6(customerOrderInfo);

        if(result != 0){
            log.info(">>操作员撤单测试成功");
            // 记录error级别的信息
        }else{
            log.info(">>操作员撤单测试失败");
        }
    }

    //@Test
    public void withdrawMoney() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建UserMapper对象，mybatis自动生成mapper代理对象
        customer_order_infoEntityMapper customerOrderInfoEntityMapper = sqlSession.getMapper(customer_order_infoEntityMapper.class);
        //调用userMapper的方法
        customer_order_info customerOrderInfo = new customer_order_info();
        customerOrderInfo.setOrder_id("1018891");
        customer_order_info result = customerOrderInfoEntityMapper.withdrawMoney(customerOrderInfo);

        if(result != null){
            log.info(">>判断订单是已撤还是未撤测试成功");
            // 记录error级别的信息
        }else{
            log.info(">>判断订单是已撤还是未撤测试失败");
        }
    }

    //@Test
    //@Rollback(false)
    public void insertCustomer_position() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建UserMapper对象，mybatis自动生成mapper代理对象
        customer_positionEntityMapper customerPositionEntityMapper = sqlSession.getMapper(customer_positionEntityMapper.class);
        //调用userMapper的方法
        List<customer_position> list = new ArrayList<>();
        customer_position customerPosition = new customer_position();
        customerPosition.setAccount_id("1024");
        customerPosition.setPosition(1000);
        customerPosition.setAmount(100);
        customerPosition.setSecurity_name("平安银行");
        customerPosition.setSecurity_id("000001");
        System.out.println(customerPosition);
        list.add(customerPosition);
        System.out.println(list);


// 将 customer_position 对象添加到 List 中
        List<customer_position> customerPositionList = new ArrayList<>();
        customerPositionList.add(customerPosition);



        /*List<customer_position> result = customerPositionEntityMapper.insertCustomer_position(customerPositionList);


        if(result != null){
            log.info(">>持仓聚合测试成功");
            // 记录error级别的信息
        }else{
            log.info(">>持仓聚合测试失败");
        }
        */



    }

    //@Test
    public void showAccountposition() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建UserMapper对象，mybatis自动生成mapper代理对象
        customer_positionEntityMapper customerPositionEntityMapper = sqlSession.getMapper(customer_positionEntityMapper.class);
        //调用userMapper的方法
        customer_position customerPosition = new customer_position();
        customerPosition.setAccount_id("1024");
        List<customer_position> result = customerPositionEntityMapper.showAccountposition(customerPosition);


        if(result != null){
            log.info(">>展示客户持仓测试成功");
            // 记录error级别的信息
        }else{
            log.info(">>展示客户持仓测试失败");
        }
    }

    //@Test
    public void deleteAccountpostion() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建UserMapper对象，mybatis自动生成mapper代理对象
        customer_positionEntityMapper customerPositionEntityMapper = sqlSession.getMapper(customer_positionEntityMapper.class);
        //调用userMapper的方法
        customer_position customerPosition = new customer_position();
        customerPosition.setAccount_id("1024");
        int result = customerPositionEntityMapper.deleteAccountpostion(customerPosition);


        if(result != 0){
            log.info(">>删除客户持仓测试成功");
            // 记录error级别的信息
        }else{
            log.info(">>删除客户持仓测试失败");
        }
    }

    //@Test
    public void showMarket_info() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建UserMapper对象，mybatis自动生成mapper代理对象
        market_infoEntityMapper marketInfoEntityMapper = sqlSession.getMapper(market_infoEntityMapper.class);
        //调用userMapper的方法

        List<market_info> result = marketInfoEntityMapper.showMarket_info();


        if(result != null){
            log.info(">>展示市场行情测试成功");
            // 记录error级别的信息
        }else{
            log.info(">>展示市场行情测试成功");
        }
    }


    //@Test
    public void searchMarket_info() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建UserMapper对象，mybatis自动生成mapper代理对象
        market_infoEntityMapper marketInfoEntityMapper = sqlSession.getMapper(market_infoEntityMapper.class);
        //调用userMapper的方法

        market_info marketInfo = new market_info();
        marketInfo.setSecurity_id("000001");

        List<market_info> result = marketInfoEntityMapper.searchMarket_info(marketInfo);


        if(result != null){
            log.info(">>查询市场行情测试成功");
            // 记录error级别的信息
        }else{
            log.info(">>查询市场行情测试成功");
        }
    }

    //@Test
    public void showSecurity_info() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建UserMapper对象，mybatis自动生成mapper代理对象
        security_infoEntityMapper securityInfoEntityMapper = sqlSession.getMapper(security_infoEntityMapper.class);
        //调用userMapper的方法

        List<security_info> result = securityInfoEntityMapper.showSecurity_info();


        if(result != null){
            log.info(">>展示证券测试成功");
            // 记录error级别的信息
        }else{
            log.info(">>展示证券测试成功");
        }
    }

    //@Test
    public void searchSHsecurity() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建UserMapper对象，mybatis自动生成mapper代理对象
        security_infoEntityMapper securityInfoEntityMapper = sqlSession.getMapper(security_infoEntityMapper.class);
        //调用userMapper的方法

        List<security_info> result = securityInfoEntityMapper.searchSHsecurity();


        if(result != null){
            log.info(">>展示上海证券测试成功");
            // 记录error级别的信息
        }else{
            log.info(">>展示上海证券测试成功");
        }
    }

    //@Test
    public void searchSZsecurity() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建UserMapper对象，mybatis自动生成mapper代理对象
        security_infoEntityMapper securityInfoEntityMapper = sqlSession.getMapper(security_infoEntityMapper.class);
        //调用userMapper的方法

        List<security_info> result = securityInfoEntityMapper.searchSZsecurity();


        if(result != null){
            log.info(">>展示深圳证券测试成功");
            // 记录error级别的信息
        }else{
            log.info(">>展示深圳证券测试成功");
        }
    }


}
