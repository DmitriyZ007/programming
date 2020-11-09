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
class Blizzard extends SpecialMove {
    public Blizzard () { super(Type.ICE,110,0.7); }
    @Override
    protected void applyOppEffects (Pokemon p) {
        if (Math.random() < 0.1){
            Effect e = new Effect();
            e.condition(Status.FREEZE);
            p.setCondition(e);
        }
    }
    @Override
    protected java.lang.String describe(){
        String s = "призвал метель на соперника";
        return s;
    }
}
class Scald extends SpecialMove {
    public Scald  () { super(Type.WATER,80,1.0); }
    @Override
    protected void applyOppEffects (Pokemon p) {
        if (Math.random() < 0.3){
            Effect e = new Effect();
            e.condition(Status.BURN);
            p.setCondition(e);
        }
    }
    @Override
    protected java.lang.String describe(){
        String s = "обливает соперника кипятком";
        return s;
    }
}
class MuddyWater  extends SpecialMove {
    public MuddyWater  () { super(Type.WATER,90,0.85); }
    @Override
    protected void applyOppEffects (Pokemon p) {
        Effect e = new Effect().chance(0.3).turns(1).stat(Stat.ACCURACY, (int)-p.getStat(Stat.ACCURACY)/10*3);
        p.setCondition(e);
    }
    @Override
    protected java.lang.String describe(){
        String s = "плюнул в соперника грязной водой";
        return s;
    }
}
