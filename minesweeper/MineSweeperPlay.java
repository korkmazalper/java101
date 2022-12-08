package minesweeper;

import java.util.Scanner;

public class MineSweeperPlay {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        boolean keepGame=true;
        String answer="";
        while(keepGame){
            System.out.print("Number of lines: ");
            int row= scanner.nextInt();
            System.out.print("Number of columns: ");
            int column= scanner.nextInt();
            MineSweeper2 mineSweeper= new MineSweeper2(row,column);
            mineSweeper.run();
            System.out.println("One More Game: (Y/N)");
            answer= scanner.next();
            if(!("Y".equals(answer.toUpperCase()))){
                System.out.println("Game over!!!");
                keepGame=false;
            }
        }

    }
}
