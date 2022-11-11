package amstrongsayi;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AmstrongSayi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Sayi giriniz: ");
        a=sc.nextInt();
        System.out.println("Basamak Sayisi: " + basamakSayisiniBul(a));
        System.out.println("Amstrong mu? " + (amstrongMu(a,basamakSayisiniBul(a))?" Evet":"Hayir"));
    }

    private static boolean amstrongMu(int a,int basamak) {
        if(basamak!=-1){
            int toplam=0;
            int b=a;
            do{
               toplam+=Math.pow(b%10,basamak);
               b=b/10;
            }while(b>0);
            if(toplam==a){
                return true;
            }else{
                return false;
            }

        }else {
            return false;
        }
    }

    public static int basamakSayisiniBul(int x){
        if(x>=0){
            int basamakSayisi=0;
            do{
                x=x/10;
                basamakSayisi++;
            }while(x!=0);
            return basamakSayisi;
        } else{
            return -1;
        }

    }
}
