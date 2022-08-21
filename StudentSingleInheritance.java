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
        
    }
}




public class StudentSingleInheritance {
    
}
