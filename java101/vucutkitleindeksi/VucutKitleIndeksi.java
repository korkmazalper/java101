package vucutkitleindeksi;

import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Boyumuzu metre cinsinden girelim: ");
        double boy=input.nextDouble();
        System.out.println("Kilomuzu  girelim: ");
        double kilo=input.nextDouble();
        System.out.println("Vücut kitle Indeksi: "+ kilo/(boy*boy));

    }
}
