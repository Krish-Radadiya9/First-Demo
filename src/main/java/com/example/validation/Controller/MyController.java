package com.example.validation.Controller;

import com.example.validation.Entity.LoginData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class MyController {
    @RequestMapping(value = "/form",method = RequestMethod.GET)
    public String handleForm(Model model){
        System.out.println("Opening Form");
        model.addAttribute("loginData",new LoginData());
        return "form";
    }
    @RequestMapping(value = "/process",method = RequestMethod.POST)
    public String handlerProcess(@Valid @ModelAttribute("loginData") LoginData loginData, BindingResult bindingResult){
        System.out.println(loginData);
        if(bindingResult.hasErrors()){
            System.out.println(bindingResult);
            return "form";
        }
        return "success";
    }
}
