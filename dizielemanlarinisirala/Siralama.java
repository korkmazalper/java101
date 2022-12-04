package dizielemanlarinisirala;

import java.util.Arrays;
import java.util.Scanner;

public class Siralama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Girilecek sayi sayisi: ");
        int n= sc.nextInt();
        int [] list= new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print(i+1 + ". sayiyi giriniz.");
            list[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(
                list
        ));
        System.out.println(Arrays.toString(sirala(list)));

    }

    private static int[] sirala(int[] list) {
        int minIndex;
        int temp;
        for (int i = 0; i < list.length-1 ; i++) {
            minIndex=i;
            for (int j = i+1; j <list.length ; j++) {
                if(list[minIndex]>list[j]){
                    minIndex=j;
                }
            }
            temp=list[i];
            list[i]=list[minIndex];
            list [minIndex]= temp;
        }
        return list;
    }
}
