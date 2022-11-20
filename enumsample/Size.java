package enumsample;

import java.util.Arrays;

public enum Size {
    SMALL("S",1), MEDIUM("M",2);
    private String abbreviation;
    private int no;
    static{
        System.out.println("static initializer");
    }
    {
        System.out.println("object initializer block");
    }
    Size(String abbreviation, int no){
        this.abbreviation=abbreviation;
        this.no=no;
    }

    public static void main(String[] args) {
        System.out.println(SMALL.ordinal());
        System.out.println(Size.MEDIUM.name());
        System.out.println(MEDIUM.ordinal());
      //  System.out.println(Arrays.stream(Size.values()).toList());
        System.out.println(Arrays.stream(Size.values()).toArray());
    }
}
