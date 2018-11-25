package kr.ac.hansung.cse.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by jihun on 2018. 11. 25..
 */

@Getter
@Setter
@ToString
public class Product {
    private int id;
    private String name;
    private String category;
    private int price;
    private String manufacturer;
    private int unitInStock;
    private String description;
}
