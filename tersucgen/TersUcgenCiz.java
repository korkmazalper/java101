package tersucgen;

import java.util.Scanner;

public class TersUcgenCiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        String tersUcgen="";
        for (int i = 0; i <n ; i++) {
            for (int j = 1; j <= i; j++) {
                tersUcgen+=" ";
            }
            for (int j = 1; j <2*(n-i) ; j++) {
                tersUcgen+="*";
            }
            for (int j = 1; j <= i; j++) {
                tersUcgen+=" ";
            }
            tersUcgen+="\n";
        }
        System.out.println(tersUcgen);
    }


}
