package cn.hlxd.microcloud.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created with IntelliJ IDEA.
 *
 * @Program：{microcloud}
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-06-29-19:07
 * @Description：
 **/

@RestController
public class UserController {
    @GetMapping("/users")
    ResponseEntity getUsers(Principal principal){

        return ResponseEntity.ok(principal);
    }
}
