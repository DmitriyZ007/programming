package com.dz.pokemons;
import com.dz.attacks.Megahorn;
import com.dz.attacks.PoisonJab;
import com.dz.attacks.Rest;
import com.dz.attacks.SmartStrike;
import ru.ifmo.se.pokemon.*;

public class Bouffalant extends Pokemon {
    //Атаки:
    // Smart Strike move
    // Poison Jab move
    // Rest move
    // Megahorn move

    public Bouffalant(String name, int lvl)
    {
        super (name, lvl);
        setStats(95,110,95,40,95,55);
        setType(Type.NORMAL);
        setMove(new SmartStrike(), new PoisonJab(), new Rest(), new Megahorn());
    }
}

