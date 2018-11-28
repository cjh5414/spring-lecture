package testHibernate;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by jihun on 2018. 11. 28..
 */

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue
    @Column(name="product_id")
    private int id;

    @Column(name="product_name")
    private String name;

    private int price;
    private String description;
}
