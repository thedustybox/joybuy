package com.thedustybox.joybuy.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@EnableAspectJAutoProxy(exposeProxy = true)
@EnableFeignClients
@EnableRabbit
@EnableDiscoveryClient
@EnableRedisHttpSession
@SpringBootApplication
@MapperScan("com.thedustybox.gulimall.order.dao")
public class JoybuyOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(JoybuyOrderApplication.class, args);
    }

}
