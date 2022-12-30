package com.kaido.employeeconsumer;

import java.io.IOException;

import com.kaido.employeeconsumer.controller.ConsumerControllerClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClientException;



@SpringBootApplication
@EnableEurekaClient
public class EmployeeConsumerApplication {

    public static void main(String[] args) throws RestClientException, IOException {
        ApplicationContext ctx =SpringApplication.run(EmployeeConsumerApplication.class, args);

    ConsumerControllerClient consumerControllerClient= ctx.getBean(ConsumerControllerClient.class);
		System.out.println(consumerControllerClient);
		consumerControllerClient.getEmployee();

}

    @Bean
    public  ConsumerControllerClient  consumerControllerClient()
    {
        return  new ConsumerControllerClient();
    }
}
