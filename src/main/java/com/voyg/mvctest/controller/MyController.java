package com.voyg.mvctest.controller;

import com.voyg.mvctest.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <strong>controller</strong><br>
 *
 * @author voyg.net
 * @see <a href="https://voyg.net">https://voyg.net</a>
 * @since 16-11-3
 */
@Controller
public class MyController {
    @Autowired
    private MyService myService;

    @RequestMapping("/")
    public String test() {
//        throw new RuntimeException("test");
        return "home";
    }
}
