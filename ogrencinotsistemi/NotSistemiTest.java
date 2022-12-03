package ogrencinotsistemi;

public class NotSistemiTest {
    public static void main(String[] args) {
        Teacher teacher= new Teacher("Hilmi Firildak","MAT","+49123232323");
        //teacher.printTeacher();
        Teacher teacher2= new Teacher("Mahmut Yildirim","TRH","+121332424243");
        Teacher teacherFizik= new Teacher("Süleyman Tek","FIZ","+121332424243");
        Teacher teacherKimya= new Teacher("Filiz Yakan","KIM","+121332424243");



        Course tarih= new Course("Tarih","101","TRH");
        tarih.addTeacher(teacher2);
        Course fizik= new Course("Fizik","101","FIZ");
        fizik.addTeacher(teacherFizik);
        Course kimya= new Course("Kimya","101","KIM");
        kimya.addTeacher(teacherKimya);

        Student s1= new Student(tarih,fizik,kimya,"Seyfettin Killi","123","5-Fen-A");
        s1.addBulkExamNote(56,44,88);
        s1.addSozluNotu(tarih,90);
        s1.addSozluNotu(fizik,40);
        s1.addSozluNotu(kimya,70);

        s1.printNote();
        System.out.println(s1.isPass());
    }
}
