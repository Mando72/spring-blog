package com.blog.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MathController {

    @RequestMapping(path = "/add/{number1}/and/{number2}")
    @ResponseBody

    public String add(@PathVariable int number1,@PathVariable int number2){
        return "Is equal to:" + (number1 + number2) ;

  }

  @RequestMapping(path = "/subtract/{number1}/from/{number2}")
    @ResponseBody

    public String sub(@PathVariable int number1, @PathVariable int number2){
        return "Is equal to:" + (number1 - number2) ;
  }

  @RequestMapping(path = "/multiply/{number1}/and/{number2}")
    @ResponseBody

    public String mult(@PathVariable int number1, @PathVariable int number2){
        return "Is equal to:" + (number1*number2);
  }

  @RequestMapping(path = "/divide/{number1}/by/{number2}")
    @ResponseBody

    public String div(@PathVariable int number1, @PathVariable int number2){
        return "IS equal to:" + (number1/number2);
  }



}

