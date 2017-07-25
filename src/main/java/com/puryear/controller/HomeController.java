package com.puryear.controller;

/**
 * Created by joyapuryear on 7/21/17.
 */



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

    @Controller
    public class HomeController {

        @RequestMapping("/")

        public ModelAndView helloWorld()
        {
            return new
                    ModelAndView("index","message","Hello World");

        }
        @RequestMapping("/form")
        //the string method returns the jsp page that we want to show
        public String htmlForm() {
            return "htmlform";
        }

        //model is a parameter that allows us to add stuff to our jsp
        //RequestParam allows us to take in data from the form -- we must assign a type and a variable with it

        @RequestMapping("/addUser")
        public String formSuccess(Model model, @RequestParam("f_name") String firstName,
                                  @RequestParam("l_name") String lastName,
                                  @RequestParam("e_mail") String email,
                                  @RequestParam("p_num") String phoneNum,
                                  @RequestParam("p_word") String password) {

            //add the values to the jsp using the model and addAttribute method
            model.addAttribute("firstName", firstName);
            model.addAttribute("lastName", lastName);
            model.addAttribute("email", email);
            model.addAttribute("phoneNumber", phoneNum);
            model.addAttribute("password", password);


            return "summary";


        }
    }






