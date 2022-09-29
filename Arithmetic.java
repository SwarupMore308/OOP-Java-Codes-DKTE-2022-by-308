package MyMath;
import java.util.*;

import javax.swing.plaf.multi.MultiInternalFrameUI;


public class Arithmetic {
    double number1,number2;
    double addition, subtraction, multiplication, division,modulo;

    Arithmetic(double number1, double number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    double getNumber1(){
        return number1;
    }

    double getNumber2(){
        return number2;
    }

    double getAddition(){
        return addition;
    }

    double getSubtraction(){
        return subtraction;
    }

    double getMultiplication(){
        return multiplication;
    }

    double getDivision(){
        return division;
    }

    double getModulo(){
        return modulo;
    }

    void setNumber1(double number1){
        this.number1 = number1;
    }
    void setNumber2(double number2){
        this.number2 = number2;
    }

    void calculateAddition(){
        addition = number1+number2;
    }

    void calculateSubtraction(){
        subtraction = number1-number2;
    }

    void calculateMultiplication(){
        multiplication = number1 * number2;
    }

    void calculateDivision(){
        division = number1/number2;
    }

    void calculateModulo(){
        modulo = number1/number2;
    }
}
