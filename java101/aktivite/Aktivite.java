package aktivite;
import java.util.Scanner;

public class Aktivite {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int temperature;
        System.out.println("Sicakligi girin: ");
        temperature = sc.nextInt();
        if(temperature <5){
            System.out.println("Kayak yapabilirsiniz.");
        } else if(temperature<15){
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if(temperature<25){
            System.out.println("Piknik yapilabilir.");
        }else{
            System.out.println("Yüzmeye gidacebilirsiniz.");
        }
    }
}
