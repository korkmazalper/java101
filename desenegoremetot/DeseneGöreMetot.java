package desenegoremetot;

import java.util.Scanner;

public class DeseneGöreMetot {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("Pozitif Tamsayi giriniz: ");
        int n= sc.nextInt();
        int p=n;
        int step=5;
        do{
            if(n<=0) step=-step;
            System.out.print(n + " ");
            n-=step;
        }while(n<=p);
    }
}
