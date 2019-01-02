package com.lxisoft.controller;

import java.util.Random;

import com.lxisoft.model.*;

public class DiceController {

    public int getRandom() {

        return new Random().nextInt(7 - 1) +  1;

    }
}