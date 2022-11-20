package kombinasyon;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kume eleman sayisi: ");
        int n=sc.nextInt();
        System.out.println("Secilecek elemean sayisi: ");
        int r=sc.nextInt();
        System.out.println(kombinasyon(n,r));
    }
    public  static int faktor(int x){
        int carpim=1;
        for (int i = 1; i <=x ; i++) {
            carpim*=i;
        }
        return carpim;
    }
    public static int kombinasyon(int n, int r){
        return faktor(n)/(faktor(r)*faktor(n-r));
    }
}
