package kdv;

import java.util.Scanner;
// odev linki https://app.patika.dev/courses/java101/pratik-kdv-hesaplama
public class Kdv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fiyat: ");
        int fiyat= scanner.nextInt();
        System.out.println(fiyat>=1000?fiyat*1.08:fiyat*1.18);

    }
}
