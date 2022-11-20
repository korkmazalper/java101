package bolunebilme;

import java.util.Random;
import java.util.Scanner;

public class Bolunebilme {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int pay = 0, payda=0;
        int input;
        System.out.println();
        input=sc.nextInt();
        for (int i = 0; i <= input; i++) {
            if(isDividible12(i)) {
                pay += i;
                payda++;
            }
        }
        System.out.println(pay/payda);
/*        Random rnd= new Random(123);
        System.out.println(rnd.nextGaussian());
        System.out.println(rnd.nextGaussian());*/
    /**/
    }
    public static boolean isDividible12(int x){
        if(x%12==0)
            return true;
        return false;
    }
}
