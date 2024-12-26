package Abstrect;

public abstract class Vechile {

    abstract void start();

    public static void main(String[] args) {
        
        Bike b=new Bike();
        b.start();
        Car c=new Car();
        c.start();
        truck t=new truck();
        t.start();
        cycle cl=new cycle();
        cl.start();




    }

}
