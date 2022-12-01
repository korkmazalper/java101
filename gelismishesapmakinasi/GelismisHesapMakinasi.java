package gelismishesapmakinasi;

import java.sql.SQLOutput;
import java.util.Scanner;


public class GelismisHesapMakinasi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        int a=0;
        int b=0;


        do {
            select=anaMenüyüGetir();
            if(select!=0 && select!=6){
                System.out.print("Birinci Sayiyi giriniz->" );
                a=scan.nextInt();
                System.out.print("Ikinci Sayiyi giriniz->" );
                b=scan.nextInt();
            } else if (select==6) {
                System.out.print("Faktoriyeli alinacak Sayiyi giriniz->" );
                a=scan.nextInt();
            }

            switch (select) {
                case 1:
                    System.out.println(a+"+"+b+"="+plus(a,b));
                    break;
                case 2:
                    System.out.println(a+"-"+b+"="+minus(a,b));
                    break;
                case 3:
                    System.out.println(a+"*"+b+"="+times(a,b));
                    break;
                case 4:
                    divide(a,b);
                    break;
                case 5:
                    System.out.println(a+"^"+b+"="+power(a,b));
                    break;
                case 6:
                    System.out.println(a+"!="+factorial(a));
                    break;
                case 7:
                    System.out.println(a+"%"+b+"="+amodb(a,b));
                    break;
                case 8:
                    System.out.println("Uzunluklari "+a+" ve "+ b +"olan dükdörtgenin cevresi= "+ 2*plus(a,b)+
                            " alani=" + times(a,b));
                    break;
                case 0:
                    System.out.println("Program bitiriliyor..");
                    break;
            }
        } while (select != 0);

    }

    private static int amodb(int a, int b) {
        return a%b;
    }

    private static int factorial(int a) {
        if(a==1){
            return 1;
        }else{
            return a*factorial(a-1);
        }
    }

    private static double power(int a, int b) {
        return Math.pow(a,b);
    }

    private static void divide(int a, int b) {
        if(b!=0){
            System.out.println("Tamsayi Bölme Islemi yapildi!  "+a+"/"+b+"="+(a/b));
        }else{
            System.out.println("= ile bölme denemesi hatasi!");
        }
    }

    private static int times(int a, int b) {
        return a*b;
    }

    private static int minus(int a, int b) {
        return a-b;
    }

    private static int plus(int a,int b) {
        return a+b;
    }
    private static int anaMenüyüGetir(){
        Scanner scan = new Scanner(System.in);
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
        System.out.println(menu);
        System.out.print("Lütfen bir işlem seçiniz :");
        int islem=scan.nextInt();
        if(islem<0 || islem>8){
            System.out.println("Gecersiz Islem girisi! 0-8 Arasi Tamsayi girilmelidir!");
            anaMenüyüGetir();
        }
        return islem;
    }
}
