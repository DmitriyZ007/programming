package com.dz.attacks;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {
    public Confide() { super(Type.NORMAL, 0.0, 1.0); }
    @Override
    protected void applyOppEffects (Pokemon p) {
        p.setMod(Stat.ATTACK,-1);
    }
    @Override
    protected java.lang.String describe(){
        return "вызывает доверие всем своим видом";
    }
}