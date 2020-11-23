package com.dz;
import com.dz.pokemons.*;
import ru.ifmo.se.pokemon.*;

class BattleGround {

    public static void main(String[] args) {
        Battle b = new Battle();
        b.addAlly(new Bouffalant("Bull", 1));
        b.addAlly(new Barboach("Smallfish", 1));
        b.addAlly(new Whiscash("Bigfish", 1));
        b.addFoe(new Igglybuff("JuniorBaloon", 1));
        b.addFoe(new Jigglypuff("MiddleBaloon", 5));
        b.addFoe(new Wigglytuff("SeniourBaloon", 7));
        b.go();
    }
}
