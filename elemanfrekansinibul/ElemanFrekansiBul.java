package elemanfrekansinibul;
/* Collection yada List varyasyonlarini kullanmadan sadece dizi islemleri ile eleman frekansi
* bulmak icin liste once siralanmis(Selection Sort) sonra algoritma tasarlanmistir.*/
public class ElemanFrekansiBul {
    public static void main(String[] args) {
        int[] list={1,2,5,5,5,5,2,2,3,3,9,9,10,11,23,23};
        int [] sortiertList=sirala(list);
        for (int i = 0; i <sortiertList.length ; i++) {
            int counter=0;
            int k=1;
            while(i+k<sortiertList.length && sortiertList[i]==sortiertList[i+k]){
                  counter++;
                  k++;
            }
           System.out.println((counter+1) + " tane " + sortiertList[i] + " elemani bulunmustur.");
           i=i+counter;
        }
    }

    private static int[] sirala(int[] list) {
        int minIndex;
        int temp;
        for (int i = 0; i < list.length-1 ; i++) {
            minIndex=i;
            for (int j = i+1; j <list.length ; j++) {
                if(list[minIndex]>list[j]){
                    minIndex=j;
                }
            }
            temp=list[i];
            list[i]=list[minIndex];
            list [minIndex]= temp;
        }
        return list;
    }
}
