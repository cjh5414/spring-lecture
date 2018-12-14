package kr.ac.hansung.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

/**
 * Created by jihun on 2018. 11. 22..
 */

@Controller
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    // private static final Logger logger = LoggerFactory.getLogger("kr.ac.hansung.controller.HomeController"); 와 같다.
    // 레벨을 상속 받아서 DEBUG가 된다.

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showHome(Locale locale, HttpServletRequest request) {

        logger.info("info level: Welcome home! {}", locale);

        String url = request.getRequestURL().toString();
        String clientIPaddress = request.getRemoteAddr();

        logger.info("Request URL: " + url);
        logger.info("Client IP: " + clientIPaddress);

        return "home";
    }
}
