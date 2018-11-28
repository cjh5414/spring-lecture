package testHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Created by jihun on 2018. 11. 28..
 */
public class Main {
    private static SessionFactory sessionFactory;

    public static void main(String[] args) {
        sessionFactory = new Configuration().configure().buildSessionFactory();

        Product product = new Product();
        product.setName("노트북");
        product.setPrice(2000);
        product.setDescription("Awesome Notebook");

        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        session.save(product);

        tx.commit();
        session.close();
    }
}
