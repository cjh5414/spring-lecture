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

        Category category1 = new Category();
        category1.setName("Computer");

        Category category2 = new Category();
        category2.setName("Car");

        Product product1 = new Product();
        product1.setName("노트북1");
        product1.setPrice(2000);
        product1.setDescription("Awesome Notebook");
        product1.setCategory(category1);

        category1.getProducts().add(product1);

        Product product2 = new Product();
        product2.setName("노트북2");
        product2.setPrice(3000);
        product2.setDescription("Awesome Notebook2");
        product2.setCategory(category1);

        category1.getProducts().add(product2);

        Product product3 = new Product();
        product3.setName("소나타");
        product3.setPrice(13000);
        product3.setDescription("Awesome Car");
        product3.setCategory(category2);

        category2.getProducts().add(product3);

        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        session.save(category1);
        session.save(category2);

        tx.commit();
        session.close();
    }
}
