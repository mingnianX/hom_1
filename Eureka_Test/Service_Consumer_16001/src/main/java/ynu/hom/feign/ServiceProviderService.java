package ynu.hom.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ynu.hom.entity.User;


@FeignClient("provider-service")//注册中心的服务名称
public interface
ServiceProviderService {
    @GetMapping("/user/getUserById/{userId}")
    User GetUserById(@PathVariable("userId") Integer userId);//服务契约  方法存根
}
