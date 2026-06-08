package com.indivaragroup.exam.spring.challenge.three.impl;

import com.indivaragroup.exam.spring.challenge.three.Animal;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Cat  implements Animal {
    @Override
    public String sound() {
        return "Meow";
    }
}
