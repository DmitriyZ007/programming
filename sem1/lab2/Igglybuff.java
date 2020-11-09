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
class Sing extends StatusMove{
    Sing(){ super(Type.NORMAL, 0.0, 0.55); }
    @Override
    protected void applyOppEffects (Pokemon p) {
        Effect e = new Effect().turns(2).condition(Status.SLEEP);
        p.setCondition(e);
    }
    @Override
    protected java.lang.String describe(){
        String s = "усыпляет соперника пением";
        return s;
    }
}
class DefenseCurl extends StatusMove{
    DefenseCurl(){ super(Type.NORMAL, 0.0, 1.0); }
    @Override
    protected void applySelfEffects (Pokemon p) {
        p.setMod(Stat.DEFENSE,1);
    }
    @Override
    protected java.lang.String describe(){
        String s = "улучшает свою защиту";
        return s;
    }
}
