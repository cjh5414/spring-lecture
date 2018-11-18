package kr.ac.hansung.spring.aop;

import lombok.Setter;

/**
 * Created by jihun on 2018. 11. 17..
 */

@Setter
public class Cat implements AnimalType {
    private String myName;

    @Override
    public void sound() {
        System.out.println("Cat name = " + myName + ": " + "Meow");
    }
}
