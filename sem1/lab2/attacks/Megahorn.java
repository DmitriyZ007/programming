package com.dz.attacks;

import ru.ifmo.se.pokemon.*;

public class Megahorn extends PhysicalMove {
    public Megahorn() {
        super(Type.BUG, 120, 0.85);
    }

    @Override
    protected String describe() {
        String s = "выпоняет суперудар рогом";
        return s;
    }
}
