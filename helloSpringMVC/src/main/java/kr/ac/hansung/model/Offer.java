package kr.ac.hansung.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by jihun on 2018. 11. 22..
 */

@Setter
@Getter
@NoArgsConstructor
@ToString
public class Offer {
    private int id;
    private String name;
    private String email;
    private String text;
}
