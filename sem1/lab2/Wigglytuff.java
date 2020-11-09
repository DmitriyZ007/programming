import ru.ifmo.se.pokemon.*;

public class Wigglytuff extends Jigglypuff {
    public Wigglytuff(String name, int lvl)
    {
        super (name, lvl);
        setStats(140,70,45,85,50,45);
        setType(Type.NORMAL, Type.FAIRY);
        setMove(new Sing(), new DefenseCurl(), new Pound(), new Confide());
    }
}
class Confide extends StatusMove {
    Confide() { super(Type.NORMAL, 0.0, 1.0); }
    @Override
    protected void applyOppEffects (Pokemon p) {
        p.setMod(Stat.ATTACK,-1);
    }
    @Override
    protected java.lang.String describe(){
        String s = "вызывает доверие всем своим видом";
        return s;
    }
}
