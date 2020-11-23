package com.dz.pokemons;
import com.dz.attacks.Blizzard;
import com.dz.attacks.MuddyWater;
import com.dz.attacks.Scald;
import com.dz.attacks.Tickle;
import ru.ifmo.se.pokemon.*;

public class Whiscash extends Barboach {
    public Whiscash(String name, int lvl)
    {
        super (name, lvl);
        setStats(110,78,73,76,71,60);
        setType(Type.WATER, Type.GROUND);
        setMove(new Blizzard(), new Scald(), new MuddyWater(), new Tickle());
    }
}
