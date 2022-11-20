package burclar;
import java.util.Scanner;
public class Burc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int month, day;
        String burc="";

        System.out.println("Dogum Ayi: ");
        month=sc.nextInt();
        System.out.println("Dogum gün: ");
        day=sc.nextInt();

        if(month==1){
            if(day<=20)
                burc="Oglak";
            else
                burc="Kova";
        }else if(month==2){
            if(day<=18)
                burc="Kova";
            else if(day>=18 && day<=28) {
                burc = "Balik";
            }
        }else if(month==3){
            if(day<=20)
                burc="Balik";
            else {
                burc = "Koc";
            }
        }else if(month==4){
            if(day<21)
                burc="Koc";
            else if(day>=21 && day<=30) {
                burc = "Boga";
            }
        }else if(month==5){
            if(day<=21)
                burc="Boga";
            else {
                burc = "Ikizler";
            }
        }else if(month==6){
            if(day<=21)
                burc="Ikizler";
            else if(day>=22 && day<=30)
            burc = "Yengec";

        }else if(month==7){
            if(day<=22)
                burc="Yengec";
            else {
                burc = "Aslan";
            }
        }else if(month==8){
            if(day<=24)
                burc="Aslan";
            else
                burc = "Basak";

        }else if(month==9){
            if(day<=22)
                burc="Basak";
            else if(day>=23 && day<=30) {
                burc = "Terazi";
            }
        }else if(month==10){
            if(day<=23)
                burc="Terazi";
            else
                burc = "Akrep";

        }else if(month==11){
            if(day<=22)
                burc="Akrep";
            else if(day>=23 && day<=30) {
                burc = "Yay";
            }
        }else if(month==12){
            if(day<=21)
                burc="Yay";
            else {
                burc = "Oglak";
            }
        } else{
            System.out.println("gecersiz tarih girisi");
            return;
        }
        System.out.println("Burcunuz:" + burc);

    }
}