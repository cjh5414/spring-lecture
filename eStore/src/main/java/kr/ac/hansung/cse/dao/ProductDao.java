package kr.ac.hansung.cse.dao;

import kr.ac.hansung.cse.model.Product;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by jihun on 2018. 11. 25..
 */

@Repository
@Transactional
public class ProductDao {
    @Autowired
    private SessionFactory sessionFactory;

    public Product getproductById(int id) {
        Session session = sessionFactory.getCurrentSession();
        Product product = session.get(Product.class, id);

        return product;
    }

    @SuppressWarnings("unchecked")
    public List<Product> getProducts() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Product");
        List<Product> productList = query.list();

        return productList;
    }

    public void addProduct(Product product) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(product);
        session.flush();
    }

    public void deleteProductById(Product product) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(product);
        session.flush();
    }

    public void editProduct(Product product) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(product);
        session.flush();
    }
}
