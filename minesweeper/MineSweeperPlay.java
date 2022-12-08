package minesweeper;

import java.util.Scanner;

public class MineSweeperPlay {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Number of lines: ");
        int row= scanner.nextInt();
        System.out.print("Number of columns: ");
        int column= scanner.nextInt();
        MineSweeper2 mineSweeper= new MineSweeper2(row,column);
        mineSweeper.run();
    }
}
