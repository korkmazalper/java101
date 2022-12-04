package tekraredenelemanbul;

import java.util.Arrays;
/*arrayda bulunan tekrar eden 0 degerleri icin program bug lidir. Bug nedeni int tipinin varsayilan degeri 0
* olmasi ve tekrar eden degerlerin yazildigi array' in baslangic elemanlarinin sifir olmasidir.*/
public class TekrarEdeniBul {
    static boolean isFound(int[] arr, int value){
        for (int i: arr) {
            if(i==value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list={1,2,3,4,4,5,6,6,1,2,2,1,3};
        int[] duplicatedList=new int[list.length/2+1];
        int startIndex=0;
        for (int i = 0; i <list.length ; i++) {
            if(list[i]%2==0){
                for (int j = 0; j < list.length; j++) {
                    if(i!=j && list[i]==list[j]){
                        if(!isFound(duplicatedList, list[i])){
                            duplicatedList[startIndex++]=list[i];
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(Arrays.toString(duplicatedList));
    }
}
