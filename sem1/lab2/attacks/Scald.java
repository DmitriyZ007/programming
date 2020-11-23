package com.dz.attacks;

import ru.ifmo.se.pokemon.*;

public class Scald extends SpecialMove {
    public Scald() {
        super(Type.WATER, 80, 1.0);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.3) {
            Effect e = new Effect();
            e.condition(Status.BURN);
            p.setCondition(e);
        }
    }

    @Override
    protected String describe() {
        return "обливает соперника кипятком";
    }
}
