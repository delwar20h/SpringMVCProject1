package com.test.util;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;

@Controller
public class HomeController {

    // Welcome Page
    @RequestMapping("/")
    public ModelAndView helloWorld()
    {
        return new
                ModelAndView("welcome","message","Hello World");

    }

    // Form page
    @RequestMapping("/userform")
    public ModelAndView userform () {
        return new
                ModelAndView("form","inst","Please enter info: ");
    }

    @RequestMapping("/formhandler")
        public ModelAndView formhandler (@RequestParam ("name") String name,
                                         @RequestParam ("email") String email)
        {

            // here's where the magic happens

            ModelAndView mv = new ModelAndView("formresponse");
            mv.addObject("name", name);
            mv.addObject("email", email);
            return mv;
        }
    // @RequestParam gets data from the field you specify and returns it with a String value named name.
    }

