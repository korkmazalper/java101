package basamaklaritopla;

import java.util.Scanner;

public class BasamaklariTopla {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        System.out.println("Bir tamsayi girelim: ");
        x= sc.nextInt();
        System.out.println(x + " sayisini basamak deger toplami: "+ basamaklariTopla(x));
    }

    private static int basamaklariTopla(int x) {
        int toplam=0;
        do{
            toplam+=x%10;
            x=x/10;
        }while(x>0);
        return toplam;
    }
}
