package sayitahmini;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Random rd = new Random();
        int target=rd.nextInt(100);
        Scanner sc= new Scanner(System.in);
        System.out.println("***********************************************");
        System.out.println("**************SAYI TAHMIN OYUNU****************");
        System.out.println("***********************************************");
        int right=0;
        int toplamhak=5;
        int[] denemisSayilar=new int[toplamhak];
        boolean isWrong=false;
        while(right<toplamhak){
            int tahmin;
            System.out.print("Tahmininiz: ");
            tahmin=sc.nextInt();
            if(tahmin<0 || tahmin>99){
                System.out.println("0 ile 100 arasinda bir tamsayi girmelisiniz.");
                if(isWrong){
                    right++;
                    System.out.println("Bir can eksiltildi.Kalan hak:"+(toplamhak-right) );
                } else{
                    isWrong=true;
                    System.out.println("Bir kez aralik disi deger girdiniz. Bundan sonraki hali girislerinizde haklariniz azaltilacaktir.");
                }
                continue;
            }else{
                denemisSayilar[right]=tahmin;
                right++;
                if(tahmin==target){
                    System.out.println("Tebrikler, Bildiniz ! Sayi:" + target);
                    break;
                }else{
                    System.out.println("Yanlis tahmin");
                    if(target>tahmin){
                        System.out.println("Kücük bir sayi girdiniz.");
                    } else{
                        System.out.println("Büyük bir sayi girdiniz.");
                    }
                    if(toplamhak-right==0){
                        System.out.println("Kaybettiniz! Sayi:"+target);
                    }else{
                        System.out.println("kalan hakkiniz:" +(toplamhak-right));
                    }
                }
            }


        }
        System.out.println("======================================");
        System.out.println("denenmis Sayilar:"+ denenmisSayilariYaz(denemisSayilar));
        System.out.println("======================================");
    }

    private static String denenmisSayilariYaz(int[] denemisSayilar) {
        String str = "[";
        for (Integer sayi: denemisSayilar) {
            if(sayi!=0)
                str+=sayi.toString()+",";
        }
        return str.substring(0,str.length()-1)+"]";
    }

}
