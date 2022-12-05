package matristranspozu;

import java.util.Random;
import java.util.Scanner;

public class MatrisTranspozu {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("satir sayisi: ");
        int row= sc.nextInt();
        System.out.println("sütun sayisi");
        int col =sc.nextInt();
        int[][] matrix=createMatrix(row,col);
        int[][] transpozuMatrix=transpoz(matrix);
        matrisgoster(matrix);
        matrisgoster(transpozuMatrix);

    }

    private static void matrisgoster(int[][] matrix) {
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println("");

        }
    }

    private static int[][] transpoz(int[][] matrix) {
        int [][] transpose = new int[matrix[0].length][matrix.length];
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transpose[j][i]=matrix[i][j];
            }
        }
        return transpose;
    }

    private static int[][] createMatrix(int row, int col) {
        int[][] matrix=new int[row][col];
        Random rd=new Random();
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j < col ; j++) {
                matrix[i][j]=rd.nextInt(2);

            }

        }
        return matrix;
    }
}
