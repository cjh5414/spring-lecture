package kr.ac.hansung.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by jihun on 2018. 11. 17..
 */

public class PetOwner {

    @Autowired // wiring by type
    @Qualifier(value="qf_cat")
    private AnimalType animal;

    public void play() {
        animal.sound();
    }
}
