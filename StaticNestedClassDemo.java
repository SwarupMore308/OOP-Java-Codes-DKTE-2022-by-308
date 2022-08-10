class OuterClass{
    static int x_outer=10;
    int y_outer = 20;
    private static int pouter = 30;

    static class StaticNestedClass{
        void display(){
            OuterClass oc = new OuterClass();
            System.out.println(x_outer);
            System.out.println(oc.y_outer);
            System.out.println(pouter);
        }
    }
}


public class StaticNestedClassDemo {
    public static void main(String[] args){
        OuterClass.StaticNestedClass nc = new OuterClass.StaticNestedClass();

        nc.display();
    }

}
