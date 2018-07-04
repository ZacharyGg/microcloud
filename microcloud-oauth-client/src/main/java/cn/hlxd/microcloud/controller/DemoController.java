package cn.hlxd.microcloud.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @Program：{microcloud}
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-06-29-15:31
 * @Description：
 **/

@RestController
public class DemoController {
    @GetMapping("/")
    public Authentication user(Authentication authentication) {
        return authentication;
    }
}
