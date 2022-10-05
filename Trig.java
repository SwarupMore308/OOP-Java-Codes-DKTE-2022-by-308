package MyMath;
import java.util.*;
<<<<<<< HEAD
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
=======

public class Trig {
    double angle,radians;
    double sine,cosine,tangent,secant,cosecant,contanget;

    Trig(){
        angle = 0.0;
        this.radians = Math.toRadians(angle);
    }
    Trig(double angle){
        this.angle = angle;
        this.radians = Math.toRadians(angle);
    }

    double getAngle(){
        return angle;
    }

    void setAngle(double angle){
        this.angle = angle;
        this.radians = Math.toRadians(angle);
    }

    double getSine(){
        return sine;
    }

    double getCosine(){
        return cosine;
    }

    double getTangent(){
        return tangent;
    }

    double getSecant(){
        return secant;
    }

    double getCosecant(){
        return cosecant;
    }

    double getCotangent(){
        return contanget;
    }

    double getRadians(){
        return radians;
    }


    void calculateSine(){
        sine=Math.sin(radians);
    }

    void calculateCosine(){
        cosine = Math.cos(radians);
    }
    void calculateTangent(){
        tangent = Math.tan(radians);
    }

    void calculateSecant(){
        secant = 1/Math.sin(radians);
    }

    void calculateCosecant(){
        cosecant = 1/Math.cos(radians);
    }

    void calculateCotangent(){
        contanget = 1/Math.tan(radians);
    }
    
>>>>>>> d408a206c6066c970f1752d13455e6d3cb8607fa
}
