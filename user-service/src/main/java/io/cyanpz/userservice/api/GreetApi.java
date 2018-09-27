package io.cyanpz.userservice.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author CPZ
 * @date 18-9-26 下午11:20
 **/
@FeignClient(value = "greet-service")
public interface GreetApi {

    @GetMapping("/greet")
    String greet(@RequestParam(value = "name") String name);

}
