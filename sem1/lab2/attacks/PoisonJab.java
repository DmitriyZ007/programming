package com.dz.attacks;

import ru.ifmo.se.pokemon.*;

public class PoisonJab extends PhysicalMove {
    public PoisonJab() {
        super(Type.POISON, 80, 1.0);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.3) {
            Effect e = new Effect();
            e.condition(Status.POISON);
            p.setCondition(e);
        }
    }

    @Override
    protected String describe() {
        return "использует ядовитый удар";
    }
}
