package kr.ac.hansung.cse.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;

/**
 * Created by jihun on 2018. 11. 25..
 */

@Getter
@Setter
@ToString
@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="product_id")
    private int id;
    private String name;
    private String category;
    private int price;
    private String manufacturer;
    private int unitInStock;
    private String description;

    @Transient
    private MultipartFile productImage;
}
