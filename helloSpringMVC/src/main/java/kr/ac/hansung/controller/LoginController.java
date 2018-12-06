package kr.ac.hansung.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @RequestMapping(value="/login", method= RequestMethod.GET)
    public String showLogin(@RequestParam(value="error", required=false) String error, Model model) {
        if (error != null) {
            model.addAttribute("errorMsg", "Invalid username or password");
        }
        return "login";
    }
}
