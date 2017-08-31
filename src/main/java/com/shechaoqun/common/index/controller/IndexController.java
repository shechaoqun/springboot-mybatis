package com.shechaoqun.common.index.controller;

import com.shechaoqun.modules.entity.Customer;
import com.shechaoqun.modules.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.Map;

/**
 * Created by chaoqunshe on 8/29/17.
 */
//@RestController
@Controller
public class IndexController {


//    @Value("${welcome.message:test}")
//    private String message = "Hello World";


  /*  @RequestMapping("/")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("/");
        return modelAndView;
    }*/

//    @RequestMapping("/")
//    public String welcome(Map<String, Object> model) {
//        model.put("message", this.message);
//        return "index";
//    }


    @Value("${application.message:Hello World}")
    private String message = "Hello World";

    @GetMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("time", new Date());
        model.put("message", this.message);
        return "welcome";
    }

    @RequestMapping("/foo")
    public String foo(Map<String, Object> model) {
        throw new RuntimeException("Foo");
    }

    @Autowired
    CustomerService customerService;

    @RequestMapping("/hello")
    public String hello(Map<String, Object> model) {
        Customer customer = customerService.getCustomerById((long)1001);
        System.out.println(customer.getUserName());
        return "hello";
    }
}
