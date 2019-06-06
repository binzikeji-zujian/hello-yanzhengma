package com.binzikeji.hello.yanzhengma.controller;

import com.binzikeji.hello.yanzhengma.utils.TCaptchaVerify;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description
 * @Author Bin
 * @Date 2019/6/5 17:31
 **/
@Controller
public class ResController {

    @RequestMapping(value = "res", method = RequestMethod.GET)
    public String res(){
        return "res";
    }

    @RequestMapping(value = "tijiaoyanzhengma", method = RequestMethod.POST)
    @ResponseBody
    public int tijiaoyanzhengma(String ticket, String rand){
        return TCaptchaVerify.verifyTicket(ticket, rand);
    }
}
