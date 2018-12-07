package kr.ac.hansung.cse.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.constraints.Min;

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

    @NotEmpty(message="The product name must not be null")
    private String name;

    private String category;

    @Min(value=0, message="The product price must not be less than zero")
    private int price;

    @NotEmpty(message="The product manufacturer must not be null")
    private String manufacturer;

    @Min(value=0, message="The product price must not be less than zero")
    private int unitInStock;

    private String description;

    @Transient
    private MultipartFile productImage;
}
