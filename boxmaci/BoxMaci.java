package boxmaci;

public class BoxMaci {
    public static void main(String[] args) {
        Fighter fighter1= new Fighter("Jackie Chan",25,100,75,25);
        Fighter fighter2= new Fighter("Van Damme",25,100,76,30);
        Match match1=new Match(fighter1,fighter2,70,100);
        match1.run();

    }
}
