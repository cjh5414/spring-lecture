package model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Grade {
    private int year;
    private int semester;
    private int credit;
}
