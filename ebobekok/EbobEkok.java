package ebobekok;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        int EBOB=0, EKOK;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir pozitif tamsayi: ");
        int n1= sc.nextInt();
        System.out.println(" Bir pozitif tamsayi daha: ");
        int n2=sc.nextInt();
        int i=1;
        while(i <= (n1<n2?n1:n2) ) {
            if(n1%i==0 && n2%i==0){
                EBOB= i;
            }
            i++;
        }

        EKOK = (n1 * n2) / EBOB;
        System.out.println("EBOB="+EBOB+ " EKOK="+EKOK);
        }

    }

