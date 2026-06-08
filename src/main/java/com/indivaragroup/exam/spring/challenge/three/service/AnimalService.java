package com.indivaragroup.exam.spring.challenge.three.service;

import com.indivaragroup.exam.spring.challenge.three.Animal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalService {

    private final Animal primaryAnimal;
    private final Animal qualifierAnimal;

    public AnimalService(Animal primaryAnimal, @Qualifier("dog") Animal qualifierAnimal) {
        this.primaryAnimal = primaryAnimal;
        this.qualifierAnimal = qualifierAnimal;
    }

    public void playSound() {
        System.out.println("Primary Animal Sound = " + primaryAnimal.sound());
        System.out.println("Qualifier Animal Sound = " + qualifierAnimal.sound());
    }
}