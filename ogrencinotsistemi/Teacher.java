package ogrencinotsistemi;

public class Teacher {
    String name;
    String branch;
    String mpno;

    public Teacher(String name, String branch, String mpno) {
        this.name = name;
        this.branch = branch;
        this.mpno = mpno;
    }


    public void printTeacher() {
        System.out.println("Teacher name: " + this.name
                +"\nBranch: "+ this.branch
                +"\nMobile Number: " +this.mpno);
    }
}
