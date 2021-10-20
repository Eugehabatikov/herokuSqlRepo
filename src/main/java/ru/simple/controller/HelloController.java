package ru.simple.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping(method = RequestMethod.GET)public String printHello(ModelMap model) {
        Date time = new Date();
        model.addAttribute("message", time.toString());
        return "hello";
    }
}
/**public class TimingController {
    @RequestMapping("/timing.action")
    public ModelAndView timing (HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        //вызов службы для запроса списка пользователей
        //List <User> list = userService.findUserByName("неделя");
        //httpServletRequest.setAttribute ("user", user);
        ModelAndView modelAndView = new ModelAndView();
        Date time = new Date();
        modelAndView.addObject("timing", time.toString());
        modelAndView.setViewName("index.jsp");
        return modelAndView;
    }
}**/
