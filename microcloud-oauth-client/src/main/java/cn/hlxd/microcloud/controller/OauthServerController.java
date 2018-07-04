package cn.hlxd.microcloud.controller;

import org.springframework.boot.autoconfigure.security.oauth2.OAuth2ClientProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Created with IntelliJ IDEA.
 *
 * @Program：{microcloud}
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-06-28-17:10
 * @Description：
 **/


@Controller
@RequestMapping("/server")
public class OauthServerController {
    private String clientId= null;
    private String clientSecret = null;
    private String accessTokenUrl = null;
    private String userInfoUrl = null;
    private String redirectUrl = null;
    private String response_type = null;
    private String code = null;
}
