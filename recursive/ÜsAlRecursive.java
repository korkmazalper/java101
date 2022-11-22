package recursive;
/* Üs alma islemini recursive olarak yapan kod yaziniz
* a^b ifadesinde a taban ve b üs olacak sekilde kullanicidan alinan iki
* tam sayi icin üs alma islemi farkli sekillerde yapilabilir. Bu problemde
* recursive metot ile yapidi.*/
import java.sql.SQLOutput;
import java.util.Scanner;

public class ÜsAlRecursive {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Tabani gir:");
        int taban=sc.nextInt();
        System.out.println("");
        System.out.print("Üs degeri girin: ");
        int üs= sc.nextInt();
        System.out.println(üssünüAl(taban,üs));

    }

    private static int üssünüAl(int taban, int üs) {
        //int returnValue=1;
        if(üs==0){
            return 1;
        }else{
            return taban*üssünüAl(taban,üs-1);
        }
    }
}
