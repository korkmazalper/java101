package palindromikkelimeler;

import java.util.Scanner;

public class PalindromikKelimeler {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.next();
        if(isPalindrome(str)){
            System.out.println(str + " palindromdur.");
        }else{
            System.out.println(str+ " palindrom degildir");
        }
    }
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
