package com.example.controllers;

import com.example.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/sample")
public class MyController {
    @Autowired
    private MyService service;

    @RequestMapping(value = {""}, method = RequestMethod.GET)
    public ModelAndView home() {
        ModelAndView mav = new ModelAndView("home");

        mav.addObject("name", "Thanh");

        return mav;
    }

    @RequestMapping(value = {"/add/{a}&{b}"}, method = RequestMethod.GET)
    public ModelAndView add(@PathVariable(value = "a") int a, @PathVariable(value = "b") int b) {
        ModelAndView mav = new ModelAndView("add");

        mav.addObject("add", service.add(a, b));
        return mav;
    }
}
