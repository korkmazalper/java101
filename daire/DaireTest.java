package daire;

import java.util.Scanner;

public class DaireTest {
    public static void main(String[] args) {
        DaireIslemler myDaire=new Daire();
        Scanner input= new Scanner(System.in);
        System.out.println("yaricapi giriniz: ");
        int yaricap= input.nextInt();
        myDaire.printCevreVeAlan(yaricap);
    }
}
