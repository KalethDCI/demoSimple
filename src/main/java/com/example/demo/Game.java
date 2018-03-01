package com.example.demo;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Bartosz on 2018-02-17.
 */
@Setter
@Getter
public class Game {

    private String name;
    private int personMin;
    private int personMax;

    public Game() {
    }

    public Game(String name, int personMin, int personMax) {
        this.name = name;
        this.personMin = personMin;
        this.personMax = personMax;
    }
}
