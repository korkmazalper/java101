package harmonikseri;

import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double seriToplami=0;
        System.out.println("Input n: ");
        n=sc.nextInt();
        if(n>0) {
            for (int i = 1; i <= n; i++) {
                seriToplami += (1.0 / i);
            }
            System.out.println(n+" icin Harmonic Seri toplami "+seriToplami);
        } else{
            System.out.println("Invalid input !");
        }


    }
}
