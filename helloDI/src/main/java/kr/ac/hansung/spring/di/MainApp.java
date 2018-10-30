package kr.ac.hansung.spring.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jihun on 2018. 10. 30..
 */
public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("kr/ac/hansung/spring/di/kr/ac/hansung/spring/di/conf/animal.xml");

        PetOwner person = (PetOwner) context.getBean("id_petOwner");
        person.play();

        context.close();
    }
}
