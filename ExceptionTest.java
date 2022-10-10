import java.util.Scanner;



class MyException extends Exception{
    MyException(String str){
        super(str);
    }
}

class Operation {
    double num1,num2;
    double ans;

    Operation(){
        num1 = 0.0;
        num2 = 0.0;
        ans = 0.0;
    }
    Operation(double num1,double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    void setNums(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    void addition(){
        ans = num1 + num2;
                
    }

    void subtraction(){
        ans = num1 - num2;
    }

    void division(){
        ans = num1 / num2;
    }

    void multiplication(){
        ans = num1 * num2;
    }

    void modulo(){
        ans = num1 % num2;
    }

}


class ExceptionTest {
    public static void main(String[] args) {
        Operation op = new Operation();
        Scanner sc = new Scanner(System.in);
        MyException me;
        
            while(true){
                System.out.println("Enter your choise \n 1.Add \n2.Sub\n3.Mul \n4.div \n5.Mod\n6.exit");
                int choice = sc.nextInt();
                System.out.println("Enter the numbers: ");
                double num1 = sc.nextDouble();
                double num2 = sc.nextDouble();
                op.setNums(num1, num2);
                try{
               

                   
                }
            }
        
        
    }
}