package kr.ac.hansung.spring.di;

import lombok.Setter;

/**
 * Created by jihun on 2018. 10. 30..
 */

@Setter
public class Cat implements AnimalType {
    private String myName;

    public void sound() {
        System.out.println("Cat name = " + myName + ":" + "Meow");
    }
}
