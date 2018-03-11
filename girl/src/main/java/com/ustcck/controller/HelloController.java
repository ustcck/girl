package com.ustcck.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by CaoKai on 2018/3/10.
 * Email:caokai@yijiahe.com
 */
@RestController
//@RequestMapping("/girl")
//@Controller
//@ResponseBody
public class HelloController {
/*
    @Value("${cupSize}")
    private String cupSize;

    @Value("${age}")
    private Integer age;

    @Value("${content}")
    private String content;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String say() {
        return "hello spring boot!";
    }

    @RequestMapping(value = "/size", method = RequestMethod.GET)
    public String size() {
        return cupSize;
    }

    @RequestMapping(value = "/age", method = RequestMethod.GET)
    public Integer age() {
        return age;
    }

    @RequestMapping(value = "/content", method = RequestMethod.GET)
    public String content() {
        return content;
    }*/

/*    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = "/size/{id}", method = RequestMethod.GET)
    public String content(@PathVariable Integer id) {
        return "id: " + id;
//        return girlProperties.getCupSize();
//        return "index";
    }*/


//    @RequestMapping(value = "/content", method = RequestMethod.GET)
    @GetMapping(value = "/content")
    public String content(@RequestParam Integer id) {
        return "id: " + id;
    }

}
