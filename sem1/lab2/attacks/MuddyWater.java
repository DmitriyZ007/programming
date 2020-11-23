package com.dz.attacks;

import ru.ifmo.se.pokemon.*;

public class MuddyWater extends SpecialMove {
    public MuddyWater() {
        super(Type.WATER, 90, 0.85);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().chance(0.3).turns(1).stat(Stat.ACCURACY, (int) -p.getStat(Stat.ACCURACY) / 10 * 3);
        p.setCondition(e);
    }

    @Override
    protected String describe() {
        return "плюнул в соперника грязной водой";
    }
}
