package com.example.demo.controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @RequestMapping("/hello")
    public String hello(@RequestParam(value = "user", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("murad", name);
        return "hello";
    }

    @RequestMapping("/{add1}+{add2}")
    public String userAddDetails(@PathVariable("add1") int add1,
                                 @PathVariable("add2") int add2) {
        // retrieve user details from DB by username
        return "result:/" + (add1 + add2);

    }

    @RequestMapping("/{sub1}-{sub2}")
    public String userSubDetails(@PathVariable("sub1") int sub1,
                                 @PathVariable("sub2") int sub2) {
        // retrieve user details from DB by username
        return "result:/" + (sub1 - sub2);

    }

    @RequestMapping("/{mul1},{mul2}")
    public String userMulDetails(@PathVariable("mul1") int mul1,
                                 @PathVariable("mul2") int mul2) {
        // retrieve user details from DB by username
        return "result:/" + (mul1 * mul2);
    }

    @RequestMapping("/{div1}/{div2}")
    public String userDivDetails(@PathVariable("div1") int div1,
                                 @PathVariable("div2") int div2) {
        // retrieve user details from DB by username
        if(div2==0) return div1+" cannot be divided by 0";
        return "result:/" + (div1 / div2);

    }
}