package com.dz.pokemons;

import com.dz.attacks.Confide;
import com.dz.attacks.DefenseCurl;
import com.dz.attacks.Pound;
import com.dz.attacks.Sing;
import ru.ifmo.se.pokemon.*;

public class Wigglytuff extends Jigglypuff {
    public Wigglytuff(String name, int lvl)
    {
        super (name, lvl);
        setStats(140,70,45,85,50,45);
        setType(Type.NORMAL, Type.FAIRY);
        setMove(new Sing(), new DefenseCurl(), new Pound(), new Confide());
    }
}

