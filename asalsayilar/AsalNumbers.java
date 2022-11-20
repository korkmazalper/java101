package asalsayilar;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AsalNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> asalSayilar=new ArrayList<>();
        for (int i = 2; i <= 100 ; i++) {
           if(asalSayi(i)){
               asalSayilar.add(i);
           }
        }
        System.out.print(asalSayilar);
    }
    public static boolean asalSayi(int x){
        for (int i = 2; i <=Math.sqrt(x) ; i++) {
               if(x%i==0){
                   return false;
               }
        }
        return true;
    }
}
