package model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;


@Getter
@Setter
@ToString
public class Course {
    private int id;
    @NotEmpty(message="과목명을 입력해주세요.")
    private String name;
    @NotEmpty(message="과목 코드를 입력해주세요.")
    private String code;
    private int year;
    private int semester;
    @NotEmpty(message="구분을 입력해주세요.")
    private String section;
    @Min(value=1, message="1 이상의 학점 수를 입력해주세요.")
    private int credit;
}
