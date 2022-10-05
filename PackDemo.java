package MyMath;

import MyMath.*;

public class PackDemo {
    public static void main(String[] args) {
        Trig t = new Trig(45);
        t.calculateSine();
        t.calculateCos();
        t.calculateTan();
        t.calculateSec();
        t.calculateCosec();
        t.calculateCot();
        System.out.println("Sine: "+t.getSine()+"\nCOS: "+t.getCos()+"\nTan: "+t.getTan()+"\nSec: "+t.getSec()+"\nCosec: "+t.getCosec()+"\nCot: "+t.getCot());

        Arithmetic arithmetic = new Arithmetic(100, 25);
        arithmetic.calculateAddition();
        arithmetic.calculateSubtraction();
        arithmetic.calculateMultiplication();
        arithmetic.calculateDivision();
        arithmetic.calculateModulo();

        System.out.println("Addition: "+arithmetic.getAddition()+"\nSubtraction: "+arithmetic.getSubtraction()+"\nMultiplication: "+arithmetic.getMultiplication()+"\nDivision: "+arithmetic.getDivision()+"\nModulo:");
        int[] data = {10,20,40,30,50};
        Stat stat = new Stat(data, 5);

        stat.calculateMin();
        stat.calculateAvarage();
        stat.calculateMax();
        stat.calculateCount();
        stat.calculateSum();

        System.out.println("Minimum: "+stat.getMin()+"\nMaximum: "+stat.getMax()+"\nCount: "+stat.getCount()+"\nSum: "+stat.getSum()+"\nAvarage: "+stat.getAvarage());
    }
}
