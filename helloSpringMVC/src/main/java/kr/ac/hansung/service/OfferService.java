package kr.ac.hansung.service;

import kr.ac.hansung.dao.OfferDAO;
import kr.ac.hansung.model.Offer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jihun on 2018. 11. 22..
 */

@Service
public class OfferService {
    @Autowired
    private OfferDAO offerDAO;

    public List<Offer> getCurrent() {
        return offerDAO.getOffers();
    }

    public void insert(Offer offer) {
        offerDAO.insert(offer);
    }
}
