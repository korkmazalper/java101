package weird;

import java.util.Scanner;

public class WeirdNotWeird extends Object{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String output;
        System.out.println("input an integer between 0 and 100: ");
        int i=sc.nextInt();
        if(i%2==1 || (i>=6 && i<=20)){
            output= "Weird";
        } else{
            output = "Not Weird";
        }
        System.out.println(i +" " +output);
        String s1=new String("text");
        String s2="text";
        String s3="text";
        System.out.println(s1==s2);
        System.out.println(s2==s3);

    }
}
