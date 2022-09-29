import MyMath.*;

public class PackDemo {
    public static void main(String[] args) {
        Trig t = new Trig(45);
        t.calculateSine();
        t.calculateCosecant();
        t.calculateCosine();
        t.calculateCotangent();
        t.calculateSecant();
        t.calculateTangent();
        System.out.println("Sine: "+t.getSine()+"Cos: "+t.getCosine());
    }
}
