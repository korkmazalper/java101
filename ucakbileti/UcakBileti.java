package ucakbileti;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int km;
        int yolcuYasi;
        int yolculukTipi;
        boolean calismayaDevam=true;
        do{
            System.out.print("Km: ");
            km=sc.nextInt();
            System.out.print("Yolcunun Yasi: ");
            yolcuYasi=sc.nextInt();
            System.out.print("Yolculuk Tipi (1-Gidis - 2-Gidis Donus): ");
            yolculukTipi=sc.nextInt();
            if(verilerDogru(km, yolcuYasi, yolculukTipi)){
                System.out.println(biletUcreti(km,yolcuYasi,yolculukTipi));
            } else{
                System.out.println("Gecersiz veri Girisi !");
                calismayaDevam=false;
            }
        }while(calismayaDevam==true);

    }

    private static double biletUcreti(int km, int yas, int yolculukTipi){
        double biletFiyati=yolculukTipi==1?km*0.10:km*2*0.10;
        double yasIndirimliFiyat=biletFiyati-biletFiyati*yasIndirimKatsayisi(yas);
        return yolculukTipi==1?yasIndirimliFiyat:(yasIndirimliFiyat-biletFiyati*.20);
    }

    private static double yasIndirimKatsayisi(int yas) {
        double indirimKatsayisi=0;
        if(yas<=12){
            indirimKatsayisi=0.50;
        } else if(yas<=24){
            indirimKatsayisi=0.10;
        } else if(yas>=65){
            indirimKatsayisi=0.30;
        }
        return indirimKatsayisi;
    }

    private static boolean verilerDogru(int km, int yas, int yolculukTipi) {
        if(kmDogru(km) && yasDogru(yas) && yolculukTipiDogru(yolculukTipi))
                return true;
        return false;
    }

    private static boolean yolculukTipiDogru(int yolculukTipi) {
        if(yolculukTipi==1 || yolculukTipi==2)
            return true;
        return false;
    }

    private static boolean yasDogru(int yas) {
        if(yas>0)
            return true;
        return false;
    }

    private static boolean kmDogru(int km) {
        if(km>0)
              return true;
        return false;
    }

}
