package com.liugaoyang.course.system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liugaoyang
 * @version 1.0.0
 * @description 测试Controller
 * @date 2020/7/12 16:59
 */
@RestController
public class TestController {

    /**
     * echo
     * @description 测试controller echo
     * @param name 名称
     * @return {@link String}
     * @author liugaoyang
     * @date 2020/7/12 17:01
     * @version 1.0.0
     */
    @GetMapping("/hello")
    public String echo(@RequestParam(value = "name") String name){
        return "hello" + name;
    }

}
