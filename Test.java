


class A{
    static final double pie = 3.142;
    double r;
    int area;

    A(){
        r=0.0;
    }
    A(double r){
        this.r= r;
    }

    double getR(){return r;}

    void setR(double r){
        this.r = r;
    }

    int getArea(){
        return area;
    }

     void calculateAreaOfCircle(){
        area = (int) (pie * (r * r));
     }
}


class B extends A{
    double h;  
    double vol;

    B(){
        h=0.0;
    }

    B(double r,double h){
        super(r);
        this.h = h;
        
    }

    void setH(double h){
        this.h = h;
    }

    double getH(){return h;}

    void calculateVol(){
        calculateAreaOfCircle();
        vol = (4/3) * area * h;     
    }
    
    double getVol(){
        return vol;
    }
}

class C extends A{
    double l;
    double volC;

    C(){
        l = 0;
    }

    C(double r,double l){
        super(r);
        this.l = l;
    }

    void setL(double l){
        this.l = l;
    }

    double getL(){return l;}

    void calculateVolCone(){
        super.calculateAreaOfCircle();
        this.volC = (1/3) * area * l;
    }

    double getVolC(){
        return volC;
    }
}


public class Test {
    public static void main(String[] args) {
        B b_object = new B(10,20);
        C c_object = new C(10,30);

        b_object.calculateVol();
        c_object.calculateVolCone();

        System.out.println(b_object.getArea());
        System.out.println(b_object.getVol());

        System.out.println(c_object.getArea());
        System.out.println(c_object.getVolC());
    }
    
}
