package yildizucgen;

import java.util.Scanner;

public class YildizUcgen {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n;
        System.out.print("Sayiyi Girin: ");
        n=sc.nextInt();
        String str="";
        for (int i = 1; i <=n ; i++) {
            for (int j = 0; j <n-i ; j++) {
                str+=" ";
            }

            for (int j = 1; j <2*i ; j++) {
                str+="*";
            }
            str+="\n";
        }
        System.out.println(str);

    }
}
