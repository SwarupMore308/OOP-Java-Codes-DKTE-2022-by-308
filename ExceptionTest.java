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

    double addition(){
        ans = num1 + num2;
        return ans;      
    }

    double subtraction(){
        ans = num1 - num2;
        return ans;
    }

    double division(){
        ans = num1 / num2;
        return ans;
    }

    double multiplication(){
        ans = num1 * num2;
        return ans;
    }

    double modulo(){
        ans = num1 % num2;
        return ans;
    }

}


class ExceptionTest {
    public static void main(String[] args) {
        Operation op = new Operation();
        Scanner sc = new Scanner(System.in);
        MyException me;
        
            while(true){
                System.out.println("Enter the numbers: ");
                double num1 = sc.nextDouble();
                double num2 = sc.nextDouble();
                op.setNums(num1, num2);
                try{
                    double ans = op.addition();
                    if(ans>1000){
                        throw new MyException("TooLongAddition Exception");
                    }
                    System.out.println(""+op.ans);
                }
                catch(Exception e){
                    System.out.println(e);
                }
                try{
                    double ans = op.subtraction();
                    if(ans<0){
                        throw new MyException("NegativeAnswer Exception");
                    }
                    System.out.println(""+op.ans);
                }
                catch(Exception e){
                    System.out.println(e);
                }
                try{
                    double ans = op.multiplication();
                    if(ans>5000){
                        throw new MyException("TooLongMultiplication Exception");
                    }
                    System.out.println(""+op.ans);
                }
                catch(Exception e){
                    System.out.println(e);
                }
                try{
                    double ans = op.division();
                    System.out.println(""+op.ans);
                }
                catch(Exception e){
                    System.out.println(e);
                }
                try{
                    double ans = op.modulo();
                    System.out.println(""+op.ans);
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }
        
        
    }
}