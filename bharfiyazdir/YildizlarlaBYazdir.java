package bharfiyazdir;

public class YildizlarlaBYazdir {
    public static void main(String[] args) {

        String [][] bHarfi= new String [10][6];
        for (int i = 0; i < bHarfi.length; i++) {
            for (int j = 0; j < bHarfi[i].length; j++) {
                if(i==0 || i==bHarfi.length-1 ||i==(bHarfi.length-1)/2 || j==0 || j==bHarfi[i].length-1){
                    bHarfi[i][j]="*";
                } else{
                    bHarfi[i][j]=" ";
                }
            }
        }
        for (String[] row:bHarfi) {
            for (String col: row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
