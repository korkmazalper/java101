package minesweeper;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper2 {
    String[][] field;
    String[][] emptyField;
    String[][] temp;
    boolean isOver=false;
    int [] userCoordinates= new int[2];
    int numberOfMines;
    int row;
    int column;
    public MineSweeper2(int row, int column) {
        this.row=row;
        this.column=column;
        field = new String[row][column];
        emptyField = new String[row][column];
        temp=new String[row][column];
        this.numberOfMines=(row*column)/4;
    }

    public void run() {
        createField(emptyField);
        createField(field);
        createField(temp);
        showField(emptyField);
        addMinesToTheField(field);
        calculateNonminedFields(field);
        System.out.println("========================");
        while(!isOver){
            userCoordinates=getCoordinates();
            checkTheMineInCoordinates(userCoordinates);
        }

    }

    private void checkTheMineInCoordinates(int[] userCoordinates) {
        if(field[userCoordinates[0]][userCoordinates[1]].equals("*")){
            System.out.println("You loss !");
            showField(field);
            isOver=true;
        } else{
            emptyField[userCoordinates[0]][userCoordinates[1]]=field[userCoordinates[0]][userCoordinates[1]];
            if(!isWin()){
                //showField(field);
                System.out.println("===================================");
                showField(emptyField);
            }else{
                System.out.println("=============================");
                System.out.println("You win !! Congratulations !!");
                System.out.println("=============================");
                showField(field);
                System.out.println("=============================");
                isOver=true;
            }

        }
    }

    private boolean isWin() {
        return ((numberOfMines+numberOfOpenFields(emptyField))==(row*column))?true:false;
    }

    private int numberOfOpenFields(String[][] emptyField) {
        int number=0;
        String num="012345678";
        for (int i = 0; i <emptyField.length ; i++) {
            for (int j = 0; j <emptyField[0].length ; j++) {
                if(num.contains(emptyField[i][j])){
                    number++;
                    //System.out.println(number);
                }
            }

        }
        return number;
    }

    private int[] getCoordinates() {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.print("Component X: ");
            userCoordinates[0]=sc.nextInt();
            System.out.print("Component Y: ");
            userCoordinates[1]=sc.nextInt();
            if(userCoordinates[0]>=0 && userCoordinates[0]<row && userCoordinates[1]>=0 && userCoordinates[1]<column){
                return userCoordinates;
            } else{
                System.out.println("The X coordinate should be between:" + 0 + " and "+row);
                System.out.println("The Y coordinate should be between:" + 0 + " and "+column);
            }
        }

    }

    private void showField(String [][] field) {
        for (int i=0; i<field.length;i++) {
            for (int j=0; j<field[0].length;j++ ) {
                System.out.print(field[i][j]+" ");
            }
            System.out.println();
        }
    }

    private void createField(String[][] field) {
        for (int i=0; i<field.length;i++) {
            for (int j=0; j<field[0].length;j++ ) {
                field[i][j]="-";
            }
        }
    }

    private String[][] addMinesToTheField(String[][] field) {
        Random rd=new Random();
        int satir;
        int sutun;
        int tempNumberOfMines=numberOfMines;
        while(tempNumberOfMines>0){
            satir=rd.nextInt(this.row);
            sutun=rd.nextInt(this.column);
            if(!field[satir][sutun].equals("*")){
                field[satir][sutun]="*";
            }else{
                continue;
            }
            tempNumberOfMines--;
        }
        return field;
    }

    private String[][] calculateNonminedFields(String[][] field) {
        int numberOfMines;
        for (int i = 0; i <field.length ; i++) {
            for (int j = 0; j <field[0].length ; j++) {
                    if(!field[i][j].equals("*")){
                        numberOfMines=0;
                        for (int k = i-1; k <=i+1 ; k++) {
                            for (int l = j-1; l <=j+1 ; l++) {
                                if(k==i && l==j) {
                                    continue;
                                }else{
                                    try{
                                        if("*".equals(field[k][l])){
                                            numberOfMines++;
                                        }
                                    }catch(Exception e){
                                        //System.out.println("exception!");
                                        continue;
                                    }
                                }
                            }
                        }
                        field[i][j]=Integer.toString(numberOfMines);
                }
            }
        }
        return field;
    }
}
