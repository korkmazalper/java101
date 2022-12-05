package employee;

import java.time.Year;
import java.util.Date;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    double tax(int salary){
        if(salary<1000) {
            return 0;
        }else{
            return salary*0.03;
        }
    }
    double bonus(int workHours){
        if(workHours>40){
            return (workHours-40)*30;
        }
        return 0;
    }

    double raiseSalary(int hireYear){
        if(buYiliGetir()-hireYear<10){
            return this.salary*0.05;
        } else if(buYiliGetir()-hireYear>9 && buYiliGetir()-hireYear<20){
            return this.salary*0.10;
        }
        return this.salary*0.15;
    }

    public String toString(){
        return "Adi: " + name
                + "\nMaasi: "+ salary
                +"\nBaslangic Yili: "+ hireYear
                +"\nMesai Saati:" + workHours
                +"\nVergi:"+tax(salary)
                +"\nBonus:"+bonus(workHours)
                +"\nMaas zammi:"+raiseSalary(hireYear)
                +"\nVergi ve Bonus ile Maas: " +(salary-tax(salary)+bonus(workHours))
                +"\nArtirilmis Maas: "+ (salary+raiseSalary(hireYear));
    }
    int buYiliGetir(){
        return Year.now().getValue();
    }
}
