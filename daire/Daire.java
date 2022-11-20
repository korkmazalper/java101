package daire;

public class Daire implements DaireIslemler {
    @Override
    public double alan(double r) {
        return Math.PI*r*r;
    }

    @Override
    public double cevre(double r) {
        return 2*Math.PI*r;
    }
    @Override
    public void printCevreVeAlan(double r){
        System.out.println("Cevre: "+cevre(r));
        System.out.println("Alan: "+ alan(r));
    }
}
