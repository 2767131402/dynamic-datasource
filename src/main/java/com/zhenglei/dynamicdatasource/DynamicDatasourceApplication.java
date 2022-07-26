package com.zhenglei.dynamicdatasource;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.zhenglei.dynamicdatasource.mapper")
@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
public class DynamicDatasourceApplication {

    public static void main(String[] args) {
        System.err.println("第一次提交");
        System.err.println("第二次提交");
        SpringApplication.run(DynamicDatasourceApplication.class, args);
    }

}
