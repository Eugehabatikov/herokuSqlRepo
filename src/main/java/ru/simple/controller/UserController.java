package ru.simple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.simple.service.UserService;
import ru.simple.pojo.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

//@EnableRetry
@Controller
public class UserController {
   //Внедрение сервиса
   @Autowired
   private UserService userService;

   @RequestMapping("/item.action")
    public ModelAndView queryUsers (HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
         //вызов службы для запроса списка пользователей
         List <User> list = userService.findUserByName("неделя");
         //httpServletRequest.setAttribute ("user", user);
         ModelAndView modelAndView = new ModelAndView();
         modelAndView.addObject("list", list);
         modelAndView.setViewName("index.jsp");
       return modelAndView;
   }
}

