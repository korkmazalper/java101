package dordunkatlaribesinkatlari;

import java.util.Scanner;

public class Katlar4Ve5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("Üs olacak sayi nedir: ");
        n= Math.abs(sc.nextInt());
        for (int i = 0; i <=n; i++) {
            System.out.print("4^"+ i +"="+(int)Math.pow(4,i) + "  5^"+i+ "=" +(int)Math.pow(5,i) +"\n");
        }

    }
}
