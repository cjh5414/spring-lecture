package kr.ac.hansung.csemall;

import lombok.*;

/**
 * Created by jihun on 2018. 11. 21..
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
