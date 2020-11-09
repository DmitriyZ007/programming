import ru.ifmo.se.pokemon.*;

public class Jigglypuff extends Igglybuff {
    public Jigglypuff(String name, int lvl)
    {
        super (name, lvl);
        setStats(115,45,20,45,25,20);
        setType(Type.NORMAL, Type.FAIRY);
        setMove(new Sing(), new DefenseCurl(), new Pound());
    }
}
class Pound extends PhysicalMove{
    Pound(){ super(Type.NORMAL, 40, 1.0); }
    @Override
    protected java.lang.String describe(){
        String s = "выполняет тяжёлый удар";
        return s;
    }
}
