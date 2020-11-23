package com.dz.pokemons;

import com.dz.attacks.*;
import com.dz.attacks.Sing;
import ru.ifmo.se.pokemon.*;

public class Igglybuff extends Pokemon {
    public Igglybuff(String name, int lvl)
    {
        super (name, lvl);
        setStats(90,30,15,40,20,15);
        setType(Type.NORMAL, Type.FAIRY);
        setMove(new Sing(), new DefenseCurl());
    }
}

