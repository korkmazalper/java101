package ussunubul;

import java.util.Scanner;
public class ÜsBulma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Taban sayiyi gir: ");
        int taban=(int) sc.nextInt();
        System.out.print("Üs gir: ");
        int üs=(int) sc.nextInt();
        System.out.println(üssünüGetir(taban,üs));

    }

    public static int üssünüGetir(int taban, int üs) {
        int result=1;
        üs=Math.abs(üs);
        if (üs == 0 & taban!=0){

        } else if(üs != 0 & taban==0){
            result=0;
        } else {
            for (int i = 1; i <=üs ; i++) {
                result*=taban;
            }
        }
        return result;
    }
}
