package kr.ac.hansung.spring.di;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by jihun on 2018. 10. 30..
 */

@RequiredArgsConstructor
public class PetOwner {

    @Autowired
    @Qualifier(value="qf_cat")
    private AnimalType animal;

    public PetOwner(AnimalType animal) {
        this.animal = animal;
    }

    void play() {
        animal.sound();
    }
}
