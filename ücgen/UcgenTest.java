package ücgen;

import java.util.Scanner;

public class UcgenTest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("a: ");
        int a = sc.nextInt();
        System.out.println("b: ");
        int b = sc.nextInt();
        System.out.println("c: ");
        int c = sc.nextInt();
        Ucgen ucgen=new Ucgen();
        System.out.println("Cevre: " + ucgen.cevre(a,b,c));
        System.out.println("Alan " + ucgen.alan(a,b,c));
    }
}
class Ucgen{
    public int cevre(int x, int y, int z ){
        return x+y+z;
    }
    public double alan(int x, int y, int z){
        double u=cevre(x,y,z)/2.0;
        return Math.sqrt(u*(u-x)*(u-y)*(u-z));
    }
}
