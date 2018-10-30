package kr.ac.hansung.spring.di;

import lombok.RequiredArgsConstructor;

/**
 * Created by jihun on 2018. 10. 30..
 */

@RequiredArgsConstructor
public class PetOwner {
    private AnimalType animal;

    public void play() {
        animal.sound();
    }
}
