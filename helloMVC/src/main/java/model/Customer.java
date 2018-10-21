package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by jihun on 2018. 10. 21..
 */

@Getter
@Setter
@AllArgsConstructor
public class Customer {
    private String id;
    private String name;
    private String email;
}
