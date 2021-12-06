package wyf.security.base.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
*@Description 用于用户登录登出
*@Author weiyifei
*@date 2021/11/13
*/
@Controller
@Slf4j
public class LoginController {



   @GetMapping("/login")
   public String login(){
       return "login";
   }

    @ResponseBody
    @GetMapping("/hello")
    public String hello(){
        return "hello security";
    }

}
