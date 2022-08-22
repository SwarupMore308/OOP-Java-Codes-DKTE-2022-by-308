import java.time.LocalDate;


class Person{
    String name;
    int day, month, year, age;
    double height,weight;
    String address;

    Person(){
        name = "";
        day = 0;
        month = 0;
        year = 0;
        age = 0;
        height = 0.0;
        weight = 0.0;
        address = "";
    }
    
    Person(String name, String address, int day, int month, int year,double height, double weight){
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
        this.height = height;
        this.weight = weight;
        this.address = address;
    }

    void calculateAge(){
        LocalDate ld =  LocalDate.now();
        this.age = ld.getYear() - year;
    }
}


class Student extends Person{
    int rollNo;
    double m1,m2,m3,m4,m5,avg;

    Student(){
        rollNo = 0;
        m1=0.0;
        m2=0.0;
        m3=0.0;
        m4=0.0;
        m5=0.0;
    }

    Student(int rollNo,double m1,double m2,double m3,double m4,double m5,String name, String address, int day, int month, int year,double height, double weight){
        this.rollNo = rollNo;
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
        this.m4=m4;
        this.m5=m5;
    }

    void calculateAvarage(){
        this.avg = (m1+m2+m3+m4+m5)/5;
    }
}



class Employee extends Person{
    int empId;
    double salary;
}



public class InheritanceTest {
    
}
