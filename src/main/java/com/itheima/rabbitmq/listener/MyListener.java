package com.itheima.rabbitmq.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MyListener {

    @RabbitListener(queues = "item_queue")
    public void myListener(String message){
        System.out.println("接收到的消息："+message);

    }
}
