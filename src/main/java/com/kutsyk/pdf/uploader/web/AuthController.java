package com.kutsyk.pdf.uploader.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Polomani on 09.07.2015.
 */

@Controller
public class AuthController {

    @RequestMapping(value = "/signin")
    public String login(Model model){

        return "/signin";
    }

    @RequestMapping(value = "/signin", method = RequestMethod.POST)
    public String auth(@RequestParam(value = "login") String login,
                       @RequestParam(value = "password") String password,
                       Model model){
        return "/desktop";
    }

    @RequestMapping(value="/signup")
    public String signUp(Model model) {
        return "/signup";
    }

    @RequestMapping(value="/signup", method = RequestMethod.POST)
    public String signUpUser (@RequestParam ("name") String name,
                              @RequestParam ("login") String login,
                              @RequestParam ("email") String email,
                              @RequestParam ("password") String pass,
                              @RequestParam ("confirm_pass") String confirmPass,
                              Model model){
        return "/desktop";
    }

}