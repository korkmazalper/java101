package Taksimetre;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        int km;
        double perKm= 2.20, total, startPrice=10;
        Scanner input= new Scanner(System.in);
        System.out.println("Mesafeyi Km olarak giriniz; ");
        km = Math.abs(input.nextInt());
        total=startPrice+km*perKm;
        System.out.println("Total: "+ (total<20?20:total));
    }
}
