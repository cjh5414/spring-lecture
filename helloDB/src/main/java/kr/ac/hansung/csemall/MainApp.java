package kr.ac.hansung.csemall;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by jihun on 2018. 11. 22..
 */
public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        OfferDAO offerDAO = (OfferDAO)context.getBean("offerDAO");
        System.out.println("The record count is " + offerDAO.getRowCount());

        List<Offer> offerList = offerDAO.getOffers();

        for (Offer offer: offerList)
            System.out.println(offer);

        Offer offer = new Offer();
        offer.setName("jihun");
        offer.setEmail("cjh5414@gmail.com");
        offer.setText("an instructor of spring framework");
        if (offerDAO.insert(offer))
            System.out.println("insert success");
        else
            System.out.println("insert fail");

        offer = offerDAO.getOffer("jihun");
        offer.setName("jihun choi");
        if (offerDAO.update(offer))
            System.out.println("update success");
        else
            System.out.println("update fail");

        offer = offerDAO.getOffer("jihun choi");
        System.out.println(offer);

        if (offerDAO.delete(offer.getId()))
            System.out.println("delete success");
        else
            System.out.println("delete fail");

        context.close();
    }
}
