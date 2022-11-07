package dordunkatlarinitopla;

import java.util.Scanner;

public class KatTopla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int toplam=0, n=1;
        do{
            System.out.print("Sayiyi giriniz: ");
            n=sc.nextInt();
            if(n%4==0) toplam+=n;
            System.out.println(" Toplam: "+toplam);
        }while(n%2==0);

    }
}
