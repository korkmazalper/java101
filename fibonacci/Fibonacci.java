package fibonacci;

import java.util.Scanner;

/*Java döngüler ile fibonacci serisi bulan program yazıyoruz. Fibonacci serisinin eleman sayısını kullanıcıdan alın.

Fibonacci Serisi Nedir ?
Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir.
Bu şekilde devam eden bu dizide sayılar birbirleriyle oranlandığında altın oran ortaya çıkar,
yani bir sayı kendisinden önceki sayıya bölündüğünde altın orana gittikçe yaklaşan bir dizi elde edilir.

Fibonacci dizisi, 0'dan başlar ve sonsuza kadar.
Her rakam, bir önceki rakamla toplanır. Elde edilen sonuç rakamın sağ tarafına yazılır.
Fibonacci dizisinin ilk on sayısı şu şekildedir:
9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34*/
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Eleman sayisini Girin: ");
        int number=sc.nextInt();
        int[] fibonacci= new int[number];
        fibonacci[0]=0;
        fibonacci[1]=1;
        System.out.print(fibonacci[0]+" "+fibonacci[1]);
        for (int i = 2; i < number; i++) {
            fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
            System.out.print(" "+fibonacci[i]);
        }


    }
}
