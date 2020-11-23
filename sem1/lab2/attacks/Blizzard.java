package com.dz.attacks;

import ru.ifmo.se.pokemon.*;

public class Blizzard extends SpecialMove {
    public Blizzard() {
        super(Type.ICE, 110, 0.7);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.1) {
            Effect e = new Effect();
            e.condition(Status.FREEZE);
            p.setCondition(e);
        }
    }

    @Override
    protected String describe() {
        return "призвал метель на соперника";
    }
}
