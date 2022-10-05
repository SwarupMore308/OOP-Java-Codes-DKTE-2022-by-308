package MyMath;
import java.util.*;
public class Trig {
    double degree;
    double sine,cos,tan,sec,cosec,cot;
    double radians;

     Trig(double degree){
        this.degree = degree;
        this.radians = Math.toRadians(this.degree);
     }
     double getSine(){
        return sine;
     }
     double getDegree(){
        return degree;
     }
     double getCos(){
        return cos;
     }
     double getTan(){
        return tan;
     }
     double getSec(){
        return sec;
     }
     double getCosec(){
        return cosec;
     }
     double getCot(){
        return cot;
     }

     double getRadians(){
        return radians;
     }

     void setDegree(double degree){
        this.degree = degree;
        this.radians = Math.toRadians(this.degree);
     }

     void calculateSine(){
        sine = Math.sin(radians);
     }

     void calculateCos(){
        cos = Math.cos(radians);
     }
     void calculateTan(){
        tan = Math.tan(radians);
     }

     void calculateSec(){
        sec = 1/Math.sin(radians);
     }

     void calculateCosec(){
        cos = 1/Math.cos(radians);
     }

     void calculateCot(){
        cot = 1/Math.tan(radians);
     }
}
