package com.dcxuexi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/***
 * @Title CityController
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/11/2 21:04
 * @Version 1.0.0
 */
@Controller
@RequestMapping("/city")
public class CityController {

    @RequestMapping("/select")
    @ResponseBody
    public String select(){
        System.out.println("CityController select ,running .....");
        return "{\"cityName\":\"shanghai\"}";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delele(){
        System.out.println("CityController delele ,running .....");
        return "city shanghai is deleted.";
    }
}
