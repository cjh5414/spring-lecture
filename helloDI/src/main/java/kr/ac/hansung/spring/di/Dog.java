package kr.ac.hansung.spring.di;

import lombok.Setter;

/**
 * Created by jihun on 2018. 10. 30..
 */

@Setter
public class Dog implements AnimalType {
    private String myName;

//    public void setMyName(String myName) {
//        this.myName = myName;
//    }

    public void sound() {
        System.out.println("Dog name = " + myName + ":" + "Bow Wow");
    }
}
