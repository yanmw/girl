package com.yanmw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by tedu on 2017/2/27.
 */
@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    @Autowired
    private girlProperties girl;

//    @RequestMapping(value ="/say",method = RequestMethod.GET)
    @GetMapping(value = "/say")
    public String say(@RequestParam(value = "id",required = false,defaultValue = "0") Integer ids){
        return "id:"+ids;
    }
}
