package yildizucgen;

import java.util.Scanner;

public class YildizUcgen {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n;
        System.out.print("Sayiyi Girin: ");
        n=sc.nextInt();
        String str="";
        int i=1;
        int increment=1;
        while(i!=0){
            for (int j = 0; j <n-i ; j++) {
                str+=" ";
            }
            for (int j = 1; j <2*i ; j++) {
                str+="*";
            }
            str+="\n";
            if(i==n){
                increment=-increment;
            }
            i+=increment;
        }
        System.out.println(str);

    }
}
