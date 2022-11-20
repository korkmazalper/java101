package AccessModifiers;

public class Modifier {
    private int i;
    Modifier2 m2= new Modifier2();
    Modifier2 m1 = new Modifier2();

    public Modifier() {

    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
class Modifier2{
    int j= (int) Math.PI;

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }
}
