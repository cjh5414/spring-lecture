package kr.ac.hansung.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Locale;

/**
 * Created by jihun on 2018. 11. 22..
 */

@Controller
public class HomeController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showHome(Locale locale, Model model) {
        return "home";
    }
}
