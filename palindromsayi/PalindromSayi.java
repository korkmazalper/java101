package palindromsayi;

import java.util.Scanner;

/*Palindrom Sayı Nedir ?
Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.

Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
*/
public class PalindromSayi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayiyi giriniz: ");
        int number=sc.nextInt();

            System.out.println(isPalindrom(number));
    }

    private static boolean isPalindrom(int number) {
        return number==reverse(number);
    }

    public static int reverse(int x){
        int reverse=0;
        while(x!=0){
            reverse=(reverse*10)+x%10;
            x=x/10;
        }
        return reverse;
    }
}
