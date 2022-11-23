package recursive;

import java.util.Scanner;

/*kullanicidan alinan bir sayinin asal olup olmadigina
* recursive bir fonksiyonun sonucu olarak
* döndüren kod*/
public class RecursiveAsal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Pozitif bir tamsayi giriniz: ");
        int n=sc.nextInt();
        if (isPrime(n, 2) == true) {
            System.out.println("Asal");
        } else {
            System.out.println("Asal degil");
        }

    }

    private static boolean isPrime(int n, int i) {
        if(i==n){
            return true;
        } else if(n%i==0){
            return false;
        }
        return isPrime(n,i+1);
    }
}
