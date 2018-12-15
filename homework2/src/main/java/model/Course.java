package model;


import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Course {
    private int id;
    private String name;
    private String code;
    private int year;
    private int semester;
    private String section;
    private int credit;
}
