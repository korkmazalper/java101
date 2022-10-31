package notortalamasi;

import java.util.Scanner;

public class OrtalamaTest {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String []dersler={"matematik","fizik","kimya","biyoloji","ingilizce"};
        int dersSayisi = 0;
        int not=0, toplam=0;
        for (int i = 0; i < 5; i++) {
            System.out.print(dersler[i] + " notunuzu girin: ");
            not= Integer.parseInt(input.nextLine());
            if(notGecerli(not)){
                dersSayisi++;
                toplam+=not;
            }
        }
        System.out.println(dersSayisi + " dersin ortalamasi: "+ toplam/dersSayisi);
    }
    public static boolean notGecerli(int x){
        if(x<=100 && x>=0) {
            return true;
        }
        return false;
    }
}
