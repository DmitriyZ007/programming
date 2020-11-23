package com.dz.attacks;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 0.0, 1.0);
    }

    /*@Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }*/
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.restore();
        Effect e = new Effect().turns(2).condition(Status.SLEEP);
        p.setCondition(e);
    }

    @Override
    protected String describe() {
        return "вылечился и пошёл спать";
    }
}
