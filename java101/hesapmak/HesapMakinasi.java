package hesapmak;

import java.util.Scanner;

public class HesapMakinasi {
    public static void main(String[] args) {
        int n1, n2,select;
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayi: ");
        n1=input.nextInt();
        System.out.print("Ikinci sayi: ");
        n2=input.nextInt();
        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bölme");
        System.out.println("Seciminiz ?");
        select=input.nextInt();
        switch (select){
            case 1:
                System.out.println(n1 +"+"+n2 +"="+(n1+n2));
                break;
            case 2:
                System.out.println(n1 +"-"+n2 +"="+(n1-n2));
                break;
            case 3:
                System.out.println(n1 +"*"+n2 +"="+(n1*n2));
                break;
            case 4:
                if(n2!=0){
                    System.out.println(n1 +"/"+n2 +"="+(n1/n2));
                    break;
                }else{
                    System.out.println("Sifira bölme yapilamaz.");
                    break;
                }
            default:
                System.out.println("Gecersiz islem");
                break;

        }
    }
}
