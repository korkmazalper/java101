package buyukkucuksayibul;

import java.util.Scanner;

public class BüyükKücükBul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max=0, min=0,howMany, girilenSayi;
        System.out.print("Kac Tane Sayi gireceksiniz: ");
        howMany=sc.nextInt();
        System.out.println("");
        for (int i = 1; i <= howMany ; i++) {
            System.out.print(i + ".inci Sayiyi girin:");
            girilenSayi=sc.nextInt();
            if(i==1){
                max=girilenSayi;min=girilenSayi;
            }
            if(girilenSayi>=max){
                max=girilenSayi;
            } else if(girilenSayi<min){
                min=girilenSayi;
            }
        }
        System.out.println("min:" + min + " max:"+max);
    }
}
