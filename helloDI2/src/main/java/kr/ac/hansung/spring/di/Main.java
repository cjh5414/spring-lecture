package kr.ac.hansung.spring.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jihun on 2018. 11. 17..
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("animal.xml");
        PetOwner person = (PetOwner) context.getBean("id_petOwner");
        person.play();

        context.close();
    }
}
