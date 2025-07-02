package ynu.hom;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.EnableFeignClients;



@SpringBootApplication
@EnableFeignClients
@LoadBalancerClient(name ="provider-service")
public class ConsumerApplication16000 {

//    @Bean
//    @LoadBalanced  //标识什么组件使用负载均衡标识        LoadBalancerClient：策略
//    public RestTemplate getRestTemplate(){
//        return new RestTemplate(); //发送请求
//    }


    public static void main(String[] args) {

        SpringApplication.run(ConsumerApplication16000.class, args);
    }



}
