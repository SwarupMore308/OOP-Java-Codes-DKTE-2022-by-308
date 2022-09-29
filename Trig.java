package MyMath;
import java.util.*;

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
    
}
