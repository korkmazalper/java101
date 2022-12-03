package ogrencinotsistemi;

public class Course {
    String name;
    String code;
    String prefix;
    int note;
    Teacher teacher;
    int sozluNotu;
    double ortalama;
    public Course(String name, String code, String prefix) {
        this.sozluNotu=0;
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }
    public void printTeacherInfo(){
        this.teacher.printTeacher();
    }
    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher=teacher;
            //printTeacherInfo();
        } else{
            System.out.println("Ders - Hoca Brans uyusmazligi.");
        }
    }

}
