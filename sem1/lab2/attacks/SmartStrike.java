package com.dz.attacks;

import ru.ifmo.se.pokemon.*;

public class SmartStrike extends PhysicalMove {
    public SmartStrike() {
        super(Type.STEEL, 70, 1.0);
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }

    @Override
    protected String describe() {
        return "пырнул рогом соперника";
    }
}
