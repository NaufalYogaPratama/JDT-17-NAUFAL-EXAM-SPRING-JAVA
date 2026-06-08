package com.indivaragroup.exam.spring.challenge.addition;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class BallBox {
    private int totalBalls = 200;
    private int blueBalls = 198;
    private int nonBlueBalls = 2;
}
