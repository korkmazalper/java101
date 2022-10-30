package Manav;

import java.util.Scanner;

import static java.text.ChoiceFormat.nextDouble;

public class Manav {
    public static void main(String[] args) {

         double [] fiyatlar={2.14,3.67,1.11,0.95,5};
         String [] urun= {"Armut", "Elma", "Domates", "Muz", "Patlican"};
         Scanner input= new Scanner(System.in);
         String tx="Kac Kilo ?";
         double toplam=0;
         double kilo=0.0;
         int k=0;
         for (String str: urun) {
            System.out.println(str+" "+tx +" :");
            kilo=input.nextDouble();
            toplam+=kilo*fiyatlar[k];
            k++;
         }
        System.out.println("Toplam:" + toplam);
    }
}
