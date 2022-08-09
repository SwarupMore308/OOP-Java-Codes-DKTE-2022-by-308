import java.util.*;

class Employee{

    /*Employee Class Consists of all Instance variable and all required Methods */
    String first_name,last_name;
    double monthlysalary,yearlysalary;
    //Constructor
    Employee(){
        first_name = "";
        last_name = "";
        monthlysalary = 0.0;
        yearlysalary = 0.0;
    }

    //Setters
    void setFirstName(String first_name){
        this.first_name = first_name;
    }
    void setLastName(String last_name){
        this.last_name = last_name;
    }

    void setMonthlySalary(double salary){
        if(salary<0){
            this.monthlysalary = 0.0;
        }
        else{
            this.monthlysalary = salary;
        }
    }

    void setYearlySalary(double yearlysalary){
        this.yearlysalary = yearlysalary;
    }

    //Getters
    String getFirstName(){
        return first_name;
    }

    String getLastName(){
        return last_name;
    }

    String getFullName(){
        return (first_name + " "+last_name);
    }

    double getMonthlySalary(){
        return monthlysalary;
    }

    double getYearlySalary(){
        return yearlysalary;
    }
}

class Employee_Test{

    /*This Class Consists of main method */

    static void displayInfo(Employee e){
        System.out.println("Full Name:- "+e.getFullName());
        System.out.println("Monthly Salary: "+e.getMonthlySalary());
        System.out.println("Yearly Salary:- "+e.getYearlySalary());
    }

    static double calculateYearlySalary(Employee e){
        return (e.getMonthlySalary() * 12);
    }

    static double calculateIncrement(Employee e){
        double ten_percentage = (e.getMonthlySalary()) * 0.10;
        e.setMonthlySalary(e.getMonthlySalary()+ten_percentage);
        double yearlysalary = (e.getMonthlySalary()*12);
        return yearlysalary;
    }


    /*Main function */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Creating 2 objects of Emplyee Class*/ 
        Employee employee_1 = new Employee();
        Employee employee_2 = new Employee();

        /*Taking First Emplyee Details */
        System.out.println("-:Enter First Employee Details:- ");
        System.out.print("Enter First Name:- ");
        String first_name = sc.next();
        System.out.print("Enter Last Name:- ");
        String last_name = sc.next();
        System.out.print("Monthly Salary:- ");
        double salary = sc.nextDouble();

        /*Setting all the values of first emplyee to their variables using object */
        employee_1.setFirstName(first_name);
        employee_1.setLastName(last_name);
        employee_1.setMonthlySalary(salary);
        employee_1.setYearlySalary(calculateYearlySalary(employee_1));

        /*Taking Second Emplyee Details */
        System.out.println("-:Enter Second Employee Details:- ");
        System.out.print("Enter First Name:- ");
        String first_name1 = sc.next();
        System.out.print("Enter Last Name:- ");
        String last_name1 = sc.next();
        System.out.print("Monthly Salary:- ");
        double salary1 = sc.nextDouble();

        /*Setting all the values of Second emplyee to their variables using object */
        employee_2.setFirstName(first_name1);
        employee_2.setLastName(last_name1);
        employee_2.setMonthlySalary(salary1);
        employee_2.setYearlySalary(calculateYearlySalary(employee_2));

        /*Display User Entered Data  */
        System.out.println("-------------------------------");
        System.out.println("-:Details of Employees:-");
        System.out.println("Employee 1: ");
        displayInfo(employee_1);


        System.out.println("-------------------------------");
        System.out.println("Employee 1: ");
        displayInfo(employee_2);

        /*Display Data after Increment */
        System.out.println("-------------------------------");
        System.out.println("-:Employees Yearly Salary After 10% Increment");


        /*Increment and set Monthly and Yearly Salarys of both the Employees */
        employee_1.setYearlySalary(calculateIncrement(employee_1));

        employee_2.setYearlySalary(calculateIncrement(employee_2));


        /*Display Emplyee Data after Increment */
        System.out.println("Employee 1:- ");
        displayInfo(employee_1);
        

        System.out.println("Employee 2:- ");
        displayInfo(employee_2);

        sc.close();
    }
}