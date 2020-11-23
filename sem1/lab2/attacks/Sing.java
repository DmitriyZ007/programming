package com.dz.attacks;

import ru.ifmo.se.pokemon.*;

public class Sing extends StatusMove {
    public Sing() {
        super(Type.NORMAL, 0.0, 0.55);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().turns(2).condition(Status.SLEEP);
        p.setCondition(e);
    }

    @Override
    protected String describe() {
        return "усыпляет соперника пением";
    }
}
