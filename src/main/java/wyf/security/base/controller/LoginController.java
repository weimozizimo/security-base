package wyf.security.base.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
*@Description 用于用户登录登出
*@Author weiyifei
*@date 2021/11/13
*/
@RestController
@RequestMapping("/user")
@Slf4j
public class LoginController {



    @GetMapping("/info")
    public Authentication userInfo(){
        SecurityContext context = SecurityContextHolder.getContext();

        Authentication authentication = context.getAuthentication();

        System.out.println(authentication.toString());

        return authentication;
    }

    @GetMapping("/hello")
    @PreAuthorize("hasRole('YOUKE')")
    public String hello(){
        return "hello friend ,im was left out";
    }

}
