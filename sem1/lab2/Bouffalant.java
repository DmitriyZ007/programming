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
class SmartStrike extends PhysicalMove {
    public SmartStrike () { super(Type.STEEL,70,1.0); }
    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }
    @Override
    protected java.lang.String describe(){
        String s = "пырнул рогом соперника";
        return s;
    }
}

class PoisonJab extends PhysicalMove {
    public PoisonJab () { super(Type.POISON,80,1.0); }
    @Override
    protected void applyOppEffects (Pokemon p) {
        if (Math.random() < 0.3){
            Effect e = new Effect();
            e.condition(Status.POISON);
            p.setCondition(e);
        }
    }
    @Override
    protected java.lang.String describe(){
        String s = "использует ядовитый удар";
        return s;
    }
}

class Rest extends StatusMove {
    public Rest () { super(Type.PSYCHIC,0.0,1.0); }
    /*@Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }*/
    @Override
    protected void applySelfEffects (Pokemon p) {
        p.restore();
        Effect e = new Effect().turns(2).condition(Status.SLEEP);
        p.setCondition(e);
    }
    @Override
    protected java.lang.String describe(){
        String s = "вылечился и пошёл спать";
        return s;
    }
}

class Megahorn extends PhysicalMove {
    public Megahorn () { super(Type.BUG,120,0.85); }
    @Override
    protected java.lang.String describe(){
        String s = "выпоняет суперудар рогом";
        return s;
    }
}
