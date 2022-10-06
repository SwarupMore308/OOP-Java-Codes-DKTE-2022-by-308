import java.util.Scanner;



class StudentInfo{
    private int studentId=0;
    private String studentName;

    StudentInfo(){
        this.studentId = 0;
        studentName = "";
    }
    StudentInfo(int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
    }

    int getStudentId(){
        return studentId;
    }

    String getStudentName(){
        return studentName;
    }

    void setStudentId(int studentId){
        this.studentId = studentId;
    }

    void setStudentName(String studentName){
        this.studentName = studentName;
    }

    void setStudentInfo(int studentId,String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
    }
}

class StudentMarks extends StudentInfo{
    private int marks1,marks2,marks3;

    StudentMarks(){
        marks1 = 0;
        marks2 = 0;
        marks3 = 0;
    }

    StudentMarks(int marks1, int marks2, int marks3){
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    int getMarks1(){return marks1;}

    int getMarks2(){ return marks2;}

    int getMarks3(){return marks3;}

    void setMarks1(int marks1){
        this.marks1 = marks1;
    }
    void setMarks2(int marks2){
        this.marks2 = marks2;
    }
    void setMarks3(int marks3){
        this.marks3 = marks3;
    }

    void setMarks(int marks1, int marks2, int marks3){
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    int[] getMarks(){
        int[] marks = {marks1,marks2,marks3};
        return marks;
    }

}

class StudentResult extends StudentMarks{
    private int totalMarks = 0;

    StudentResult(){
        totalMarks = 0;
    }

    StudentResult(int totalMarks){
        this.totalMarks = totalMarks;
    }

    int getTotalMarks(){return totalMarks;}

    void setTotalMarks(int totalMarks){
        this.totalMarks = totalMarks;
    }

     void calculateTotalMarks(){
        int[] markss = getMarks();

        setTotalMarks(markss[0]+markss[1]+markss[2]);
    }

    static void display(StudentResult sr){
        System.out.println("Topper Student Details");
        System.out.println("Student Id: "+sr.getStudentId());
        System.out.println("Name: "+sr.getStudentName());
        System.out.println("Total Marks: "+sr.getTotalMarks());
    }
}






public class TestOne {

    static int findTopper(StudentResult[] sr){
        int max = sr[0].getTotalMarks();
        int topIndex = 0;
        for(int i = 1;i<5;i++){
            if(max<=sr[i].getTotalMarks()){
                max = sr[i].getTotalMarks();
                topIndex = i;
            }
        }
        return topIndex;
    }
    public static void main(String[] args) {
        StudentResult sr[] = new StudentResult[5];
        Scanner sc = new Scanner(System.in);
        int count = 0;

        for(int i = 0; i<5;i++){
            sr[i] = new StudentResult();
            count++;
            sr[i].setStudentId(count);
            System.out.print("Student Name: ");
            String name = sc.next();
            System.out.println("Enter The Following Marks");
            System.out.print("Marks 1: ");
            int marks1 = sc.nextInt();
            System.out.print("Marks 2: ");
            int marks2 = sc.nextInt();
            System.out.print("Marks 3: ");
            int marks3 = sc.nextInt();
            sr[i].setStudentName(name);
            sr[i].setMarks(marks1,marks2,marks3);
            sr[i].calculateTotalMarks();
        }
        int topIndex = TestOne.findTopper(sr);
        StudentResult.display(sr[topIndex]);
        sc.close();
        
    }
}
