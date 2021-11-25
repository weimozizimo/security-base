package wyf.security.base;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.TestingAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;

@SpringBootTest
class BaseApplicationTests {

    @Test
    public void test1(){
        SecurityContext context = SecurityContextHolder.createEmptyContext();
        Authentication authentication = new TestingAuthenticationToken("username", "password", "ROLE_USER");
        context.setAuthentication(authentication);

        SecurityContextHolder.setContext(context);


        context = SecurityContextHolder.getContext();

        Authentication auth = context.getAuthentication();

        String name = auth.getName();
        Object principal = auth.getPrincipal();
        Collection<? extends GrantedAuthority> authorities = auth.getAuthorities();

        ArrayList<? extends GrantedAuthority> list = new ArrayList<>(authorities);

        for (GrantedAuthority authority : list) {
            authority.getAuthority();
        }

        System.out.println(name);
        System.out.println(principal);
        authorities.forEach(System.out::println);



    }


    

    @Test
    public void test2(){

    }



}
