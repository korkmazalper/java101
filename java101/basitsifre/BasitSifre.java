package basitsifre;

import java.util.Scanner;

public class BasitSifre {
    public static void main(String[] args) {
        String userName, password,savedPassword="12345";
        String savedUserName="kullanici";
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanici adi: ");
        userName=input.nextLine();
        System.out.print("Sifre: ");
        password=input.nextLine();

        if(userName.equals(savedUserName) && savedPassword.equals(password)){
            System.out.println("Giris basarili !");
        } else{
            System.out.println("Giris basarisiz!");
            System.out.println("Sifre degistirmek ister misiniz?");
            String sifreDegistir=input.nextLine().toUpperCase();
            if(sifreDegistir.equals("E")||sifreDegistir.equals("Y")){
                System.out.println("yeni sifrnizi giriniz");
                String yeniPassword=input.nextLine();
                if(yeniPassword!=savedPassword){
                    savedUserName=yeniPassword;
                    System.out.println("Sifre degisimi basarili !");
                } else{
                    System.out.println("eski sifrenizi girdiniz");
                }
            }

        }
    }
}
