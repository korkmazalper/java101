package Notort;

import java.util.Scanner;

public class Notort {

            public static void main(String[] args) {
                int top=0;
                Scanner sc=new Scanner(System.in);
                System.out.print("Matematik: ");
                top+=sc.nextInt();
                System.out.print("Fizik: ");
                top+=sc.nextInt();
                System.out.print("Kimya: ");
                top+=sc.nextInt();
                System.out.print("Bio: ");
                top+=sc.nextInt();
                double ort=top/4;
                System.out.println(ort>=60?"Gecti":"Kaldi");
            }
        }
