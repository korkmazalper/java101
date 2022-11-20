package artikyil;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int year;
        try{
            System.out.println("Yili giriniz: ");
            year=sc.nextInt();
            if(artikyil(year)){
                System.out.println(year + " artik bir yildir!");
            } else{
                System.out.println(year + " yili artik degildir!");
            }
        }
        catch(Exception e){
            System.out.println("Bir hata olustu: "+ e);
        }
    }

    private static boolean artikyil(int year) {
        boolean result= false;
        if(year%400==0 ){
           result =true;
        }else if(year%4==0 && year%100!=0){
               result = true;
        } else{
            result=false;
        }
        return result;
    }
}
