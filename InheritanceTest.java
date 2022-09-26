import java.time.LocalDate;
import java.util.Scanner;


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

    void setName(String name){
        this.name = name;
    }
     
    void setAddress(String address){
        this.address = address;
    }

    void setDay(int day){
        this.day = day;
    }

    void setMonth(int month){
        this.month = month;
    }

    void setYear(int year){
        this.year = year;
    }

    void setHeight(double height){
        this.height = height;
    }

    void setWeight(double weight){
        this.weight = weight;
    }

    String getName(){
        return name;
    }

    String getAddress(){
        return address;
    }

    int getDay(){
        return day;
    }

    int getMonth(){
        return month;
    }

    int getYear(){
        return year;
    }

    double getHeight(){
        return height;
    }

    double getWeight(){
        return weight;
    }

    int getAge(){
        return age;
    }
    String getDOB(){
        return (day+"/"+month+"/"+year);
    }

    void calculateAge(){
        LocalDate ld =  LocalDate.now();
        this.age = ld.getYear() - year;
    }

    /*static void display(){
        System.out.println("This is base class method");
    }*/
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
        super(name,address,day,month,year,height,weight);
        this.rollNo = rollNo;
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
        this.m4=m4;
        this.m5=m5;
    }

    void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }

    void setMarks(double m1,double m2,double m3,double m4,double m5){
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
        this.m4=m4;
        this.m5=m5;
    }

    void setAvarage(double avg){
        this.avg = avg;
    }

    int getRollNo(){
        return rollNo;
    }

    double getM1(){
        return m1;
    }
    double getM2(){
        return m2;
    }
    double getM3(){
        return m3;
    }
    double getM4(){
        return m4;
    }
    double getM5(){
        return m5;
    }
    double getAvarage(){
        return avg;
    }

    void calculateAvarage(){
        this.avg = (m1+m2+m3+m4+m5)/5;
    }
    static void display(){
        System.out.println("This is base class method");
    }
}



class Employee extends Person{
    int empId;
    double salary,tax;

    Employee(){
        empId = 0;
        salary = 0.0;
        tax = 0.0;
    }
    Employee(int empId,double salary,String name, String address, int day, int month, int year,double height, double weight){
        super(name,address,day,month,year,height,weight);
        this.empId = empId;
        this.salary = salary;
        this.tax = 0.0;
    }

    void calculateTax(){
        if(super.age<60){
            if(salary < 250000){
                tax = 0.0;
            }
            else if(salary>=250000 && salary<500000){
                tax = salary * 0.05;
            }
            else if(salary>=500000 && salary<1000000){
                tax = 25000 + salary * 0.20;
            }
            else{
                tax = 112500 + salary * 0.30;
            }
        }
        
        else if(super.age>=60 && super.age<80){
            if(salary < 300000){
                tax = 0.0;
            }
            else if(salary>=300000 && salary<500000){
                tax = salary * 0.05;
            }
            else if(salary>=500000 && salary<1000000){
                tax = 10000 + salary * 0.20;
            }
            else{
                tax = 110000 + salary * 0.30;
            }
        }

        else if(super.age>=80){
            if(salary < 500000){
                tax = 0.0;
            } 
            else if(salary>=500000 && salary<1000000){
                tax = salary * 0.20;
            }
            else{
                tax = 100000 + salary * 0.30;
            }
        }
    }
    static void display(){
        System.out.println("This is base class method");
    }
}



public class InheritanceTest {
    static String name;
    static int day, month, year;
    static double height,weight;
    static String address;

    static int rollNo;
    static double m1,m2,m3,m4,m5;
    static int empId;
    static double salary;


    static Scanner sc = new Scanner(System.in);

    static void inputPersonInfo(){
        System.out.println("----------Enter Following Data----------");
        System.out.print("Name: ");
        name = sc.next();
        System.out.print("Date of Birth(dd mm yyyy):  ");
        day = sc.nextInt();
        month = sc.nextInt();
        year = sc.nextInt();
        System.out.print("Height(m): ");
        height = sc.nextDouble();
        System.out.print("Weight: ");
        weight = sc.nextDouble();
        System.out.print("Address: ");
        address = sc.next();
    }

    static void inputStudentInfo(){

        System.out.print("Roll No: ");
        rollNo = sc.nextInt();
        System.out.println("Marks(5 Subjects): ");
        System.out.print("Sub1: ");
        m1 = sc.nextDouble();
        System.out.print("Sub2: ");
        m2 = sc.nextDouble();
        System.out.print("Sub3: ");
        m3 = sc.nextDouble();
        System.out.print("Sub4: ");
        m4 = sc.nextDouble();
        System.out.print("Sub5: ");
        m5 = sc.nextDouble();
    }


    static void inputEmployeeInfo(){
        System.out.println("Employee Id: ");
        empId = sc.nextInt();
        System.out.println("Salary: ");
        salary = sc.nextDouble();
    }
    public static void main(String[] args) {
        
       Employee e1 = new Employee();
       Employee.display();

        //Scanner sc = new Scanner(System.in);

        System.out.println("Select One: ");
        System.out.println("1.Student \n2.Employee");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                inputPersonInfo();
                inputStudentInfo();
                Student st = new Student(rollNo,m1,m2,m3,m4,m5,name,address,day,month,year,height,weight);
                st.calculateAge();
                st.calculateAvarage();
                System.out.println("-----Student Data-----");
                System.out.println("Name: "+st.name);
                System.out.println("Age: "+st.age);
                System.out.println("Avarage: "+st.avg);
                break;
            case 2:
                inputPersonInfo();
                inputEmployeeInfo();
                Employee employee = new Employee(empId,salary,name,address,day,month,year,height,weight);
                employee.calculateAge();
                employee.calculateTax();
                System.out.println("-----Employee Data-----");
                System.out.println("Name: "+employee.name);
                System.out.println("Age: "+employee.age);
                System.out.println("Salary: "+employee.salary);
                System.out.println("Tax: "+employee.tax);
                break;
        }
    }
}
