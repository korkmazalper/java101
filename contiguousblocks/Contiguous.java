package contiguousblocks;

import java.util.Scanner;

public class Contiguous {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of entries:");
        int n = sc.nextInt();
        int [] list= new int [n];
        //int list [] ={1, -2, 4, -5, 1};
        int counter=0;
        int sum;
        for (int i = 0; i < list.length; i++) {
            System.out.println((i+1)+".th entry: ");
            list[i]=sc.nextInt();
        }
        for (int i = 0; i <list.length ; i++) {
            for (int j = 0; j <list.length ; j++) {
                sum=0;
                for (int k = i; k <j+1 ; k++) {
                    sum+=list[k];
                    System.out.print(list[k]);
                }
                if(sum<0){
                    //System.out.println(sum);
                    counter++;
                }
                System.out.println();
            }
        }
        System.out.println("counter:"+counter);
    }

}
