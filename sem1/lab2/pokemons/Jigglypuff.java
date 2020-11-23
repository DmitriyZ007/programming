package com.dz.pokemons;

import com.dz.attacks.DefenseCurl;
import com.dz.attacks.Pound;
import com.dz.attacks.Sing;
import ru.ifmo.se.pokemon.*;

public class Jigglypuff extends Igglybuff {
    public Jigglypuff(String name, int lvl)
    {
        super (name, lvl);
        setStats(115,45,20,45,25,20);
        setType(Type.NORMAL, Type.FAIRY);
        setMove(new Sing(), new DefenseCurl(), new Pound());
    }
}
