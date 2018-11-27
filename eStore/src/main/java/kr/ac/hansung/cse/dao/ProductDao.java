package kr.ac.hansung.cse.dao;

import kr.ac.hansung.cse.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by jihun on 2018. 11. 25..
 */

@Repository
public class ProductDao {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<Product> getProducts() {
        String sqlStatement = "select * from product";

        return jdbcTemplate.query(sqlStatement, new RowMapper<Product>() {
            @Override
            public Product mapRow(ResultSet rs, int i) throws SQLException {
                Product product = new Product();

                product.setId(rs.getInt("id"));
                product.setName(rs.getString("name"));
                product.setCategory(rs.getString("category"));
                product.setPrice(rs.getInt("price"));
                product.setManufacturer(rs.getString("manufacturer"));
                product.setUnitInStock(rs.getInt("unitInStock"));
                product.setDescription(rs.getString("description"));

                return product;
            }
        });
    }

    public boolean addProduct(Product product) {
        String name = product.getName();
        String category = product.getCategory();
        int price = product.getPrice();
        String manufacturer = product.getManufacturer();
        int unitIntStock = product.getUnitInStock();
        String description = product.getDescription();

        String sqlStatement = "insert into product (name, category, price, manufacturer, unitInStock, description) values (?,?,?,?,?,?)";
        return (jdbcTemplate.update(sqlStatement, new Object[]{name, category, price, manufacturer, unitIntStock, description}) == 1);
    }
}
