package com.voyg.mvctest.config;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * <strong>custome interceptor</strong><br>
 *
 * @author voyg.net
 * @see <a href="https://voyg.net">https://voyg.net</a>
 * @since 16-11-3
 */
public class MyInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String url = String.valueOf(request.getRequestURL());
        String method = request.getMethod();
        Map<String, String[]> param = request.getParameterMap();
        System.out.println("request comes ! url is: [" + url + "] method is: [" + method + "]");
        System.out.println("request param: [" + param + "]");
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("Congratulations ! request is finished !");
    }
}
