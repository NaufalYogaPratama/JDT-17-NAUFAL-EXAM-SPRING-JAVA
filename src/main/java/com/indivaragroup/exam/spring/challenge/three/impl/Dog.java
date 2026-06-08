package com.indivaragroup.exam.spring.challenge.three.impl;

import com.indivaragroup.exam.spring.challenge.three.Animal;
import org.springframework.stereotype.Component;

@Component("dog")
public class Dog implements Animal {
    @Override
    public String sound() {
        return "Woof";
    }
}
