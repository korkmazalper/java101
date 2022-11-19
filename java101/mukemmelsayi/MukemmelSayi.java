package mukemmelsayi;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir pozitif tamsayi giriniz: ");
        int sayi=sc.nextInt();
        if(mukemmelSayi(sayi)){
            System.out.println(sayi + " mukemmeldir");
        } else{
            System.out.println(sayi +" mukemmel degildir!");
        }
    }

    private static boolean mukemmelSayi(int sayi) {
        int toplam=0;
        for (int i = 1; i <sayi/2+1 ; i++) {
            if(sayi%i==0){
                toplam+=i;
            }
        }
        if(toplam==sayi){
            return true;
        }
        return false;
    }
}
