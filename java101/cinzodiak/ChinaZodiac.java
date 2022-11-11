package cinzodiak;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class ChinaZodiac {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            short year = 0;
            System.out.print("Dogum yiliniz: ");
            year = sc.nextShort();
            System.out.println("Cin Burcunuz:" + getirZodiaci(year));

        }
        catch(Exception e){
            System.out.println("Karsilasilan Hata:" + e);
        }

    }

    private static String getirZodiaci(short year) {
        if (year > 0) {
            switch (year % 12) {
                default:
                    return "gecersiz girdi nedeniyle bulunamadi.";
                case 0:
                    return "Maymun";
                case 1:
                    return "Horoz";
                case 2:
                    return "Köpek";
                case 3:
                    return "Domuz";
                case 4:
                    return "Fare";
                case 5:
                    return "Öküz";
                case 6:
                    return "Kaplan";
                case 7:
                    return "Tavsan";
                case 8:
                    return "Ejderha";
                case 9:
                    return "Yilan";
                case 10:
                    return "At";
                case 11:
                    return "Koyun";
            }
        } else{
            return "gecersiz girdi nedeniyle bulunamadi.";
        }

    }
}

