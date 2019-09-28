package com.itheima.rabbitmq;

import lombok.Data;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@SpringBootApplication
public class ConsumerApplication {
    int q;
    int w ;
    LocalDateTime time;
    public static void main(String[] args) {
        //SpringApplication.run(ConsumerApplication.class,args);



        ConsumerApplication consumerApplication = new ConsumerApplication();
        consumerApplication.setQ(1);
        consumerApplication.setW(1);
        System.out.println(consumerApplication);
        System.out.println(LocalDate.now()+"  "+LocalTime.now());
        System.out.println(LocalDateTime.now()+"");
//        int q = consumerApplication.q;

        System.out.println(2);


        label:
        for(int i=0;i<10;i++){

            for(int j=0;j<10;j++){

                System.out.println("i="+i+"j="+j);

                if(j==5){
                    break label;
                }

            }

        }

    }


}
