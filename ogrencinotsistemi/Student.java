package ogrencinotsistemi;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Student {
    Course c1,c2,c3;
    String name;
    String studentNo;
    String sinif;
    double average;
    boolean isPass;

    public Student(Course c1, Course c2, Course c3, String name, String studentNo, String sinif) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.name = name;
        this.studentNo = studentNo;
        this.sinif = sinif;
        this.average=0.0;
        this.isPass=false;
    }
    void addBulkExamNote(int note1, int note2, int note3){
        if(note1>=0 && note1<=100){
            c1.note=note1;
        }
        if(note2>=0 && note2<=100){
            c2.note=note2;
        }
        if(note3>=0 && note3<=100){
            c3.note=note3;
        }
    }
    void addSozluNotu(Course course, int sozluNotu ){
        if(sozluNotu>0 && sozluNotu<=100){
            if(this.c1.name.equals(course.name)){
                c1.sozluNotu=sozluNotu;
            } else if (this.c2.name.equals(course.name)) {
                c2.sozluNotu=sozluNotu;
            } else if (this.c3.name.equals(course.name)) {
                c3.sozluNotu=sozluNotu;
            }else{
                System.out.println("gecersiz ders adi girisi");
            }
        } else{
            System.out.println("gecersiz Sozlu notu girisi.");
        }
    }
    double dersOrtalamaHesapla(Course course){
        return course.ortalama=course.note*0.8+course.sozluNotu*0.2;
    }
    void printNote(){
        System.out.println(c1.name+" Notu = "+c1.note+ " Sozlu Notu = "+c1.sozluNotu+" Ortalama = "+yuvarla( dersOrtalamaHesapla(c1)));
        System.out.println(c2.name+" Notu = "+c2.note+" Sozlu Notu = "+c2.sozluNotu+" Ortalama = "+yuvarla( dersOrtalamaHesapla(c2)));
        System.out.println(c3.name+" Notu = "+c3.note+" Sozlu Notu = "+c3.sozluNotu+" Ortalama = "+yuvarla( dersOrtalamaHesapla(c3)));
    }
    String isPass(){
        return ((dersOrtalamaHesapla(c1)+dersOrtalamaHesapla(c2)+dersOrtalamaHesapla(c3))/3.0>=55)?"Gecti":"Kaldi";
    }
    String yuvarla(double d){
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
       return df.format(d);
    }


}
