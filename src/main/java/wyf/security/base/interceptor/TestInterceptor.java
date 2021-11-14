package wyf.security.base.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterSecurityInterceptor;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

@Slf4j
public class TestInterceptor extends FilterSecurityInterceptor {


    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        String contentType = request.getContentType();
        log.info(contentType);
        System.out.println(contentType);
        invoke(new FilterInvocation(request, response, chain));
    }
}
