package com.dz.attacks;

import ru.ifmo.se.pokemon.*;

public class DefenseCurl extends StatusMove {
    public DefenseCurl() {
        super(Type.NORMAL, 0.0, 1.0);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.DEFENSE, 1);
    }

    @Override
    protected String describe() {
        return "улучшает свою защиту";
    }
}
