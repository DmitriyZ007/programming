package com.dz.pokemons;

import com.dz.attacks.Blizzard;
import com.dz.attacks.MuddyWater;
import com.dz.attacks.Scald;
import ru.ifmo.se.pokemon.*;

public class Barboach extends Pokemon {
    //Attacks
    // Blizzard
    // Scald
    // Muddy Water
    public Barboach(String name, int lvl)
    {
        super (name, lvl);
        setStats(50,48,43,46,41,60);
        setType(Type.WATER, Type.GROUND);
        setMove(new Blizzard(), new Scald(), new MuddyWater());
    }
}

