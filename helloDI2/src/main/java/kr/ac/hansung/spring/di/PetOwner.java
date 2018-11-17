package kr.ac.hansung.spring.di;

/**
 * Created by jihun on 2018. 11. 17..
 */

public class PetOwner {
    private AnimalType animal;

    public PetOwner(AnimalType at) {
        this.animal = at;
    }

    public void play() {
        animal.sound();
    }
}
