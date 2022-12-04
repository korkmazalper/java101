package harmonicortalama;

import java.util.Scanner;

public class HarmonikOrtalamaBul {
    public static void main(String[] args) {
        double [] serial={1,4,4};

        System.out.println("Harmonic ortalama: " +(serial.length/harmonikSeriyiGetir(serial)));

    }
    private static double harmonikSeriyiGetir(double[] serial) {
        double sum=0;
        for (double i: serial) {
            if(i!=0) {
                sum += 1 / i;
            }
        }
        return sum;
    }
}
