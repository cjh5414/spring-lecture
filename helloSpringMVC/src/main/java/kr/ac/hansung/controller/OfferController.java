package kr.ac.hansung.controller;

import kr.ac.hansung.model.Offer;
import kr.ac.hansung.service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by jihun on 2018. 11. 22..
 */

@Controller
public class OfferController {
    @Autowired
    private OfferService offerService;

    @RequestMapping("/offers")
    public String showOffers(Model model) {
        List<Offer> offers = offerService.getCurrent();
        model.addAttribute("offers", offers);

        return "offers";
    }

    @RequestMapping("/createOffer")
    public String createOffer(Model model) {
        model.addAttribute("offer", new Offer());

        return "createOffer";
    }
}
