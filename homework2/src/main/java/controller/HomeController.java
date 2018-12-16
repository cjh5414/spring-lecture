package controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String showHome(Authentication authentication, Model model) {
        if (authentication != null)
            model.addAttribute("username", authentication.getName());
        return "home";
    }
}
