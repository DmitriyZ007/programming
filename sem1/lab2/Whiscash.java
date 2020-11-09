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
class Tickle extends StatusMove {
    Tickle() { super(Type.NORMAL,0,1.0); }
    @Override
    protected void applyOppEffects (Pokemon p) {
        p.setMod(Stat.ATTACK,-1);
        p.setMod(Stat.DEFENSE,-1);
    }
    @Override
    protected java.lang.String describe(){
        String s = "щекочет соперника";
        return s;
    }
}
