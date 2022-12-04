package enyakinsayibul;

import java.util.Scanner;

public class EnYakinSayiyiBul {
    public static void main(String[] args) {
        int [] dizi={-250,45,2,12,143,-765,9,46,13,47};
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int enyakinkucuk=Math.abs(x-dizi[0]);
        int enyakinbuyuk=Math.abs(x-dizi[0]);
        for (int i: dizi) {
                if(i<x && Math.abs(x-i)<Math.abs(x-enyakinkucuk)){
                    enyakinkucuk=i;
                }
            if(i>x && Math.abs(x-i)<Math.abs(enyakinbuyuk-x)){
                enyakinbuyuk=i;
            }
        }
        System.out.println(enyakinbuyuk);
        System.out.println(enyakinkucuk);
    }
}
