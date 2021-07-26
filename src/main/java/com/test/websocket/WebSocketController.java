package com.test.websocket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebSocketController {

    @RequestMapping("/websocket/{name}")
    public String webSocket(@PathVariable String name, Model model){
        Logger logger = LoggerFactory.getLogger(this.getClass());
        logger.info("跳转到websocket的页面上");
        model.addAttribute("username",name);
        return "test.html";
    }
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
       return "hello";
    }
}
