package Inhertance;

public class ChildClass extends ParentsClass {

public void Bike(){
    System.out.println("Child Bike");
}
public void Bags(){
    System.out.println("Childs Bags");
}
public void Laptop(){
    System.out.println("Child laptop");
}
public void Books(){
    System.out.println("Child Books");
}

    public static void main(String[] args) {

ParentsClass p=new ParentsClass();
p.House();
p.Money();
p.car();
p.locker();
System.out.println("-----------------------------------------");
ChildClass c=new ChildClass();
c.Bags();
c.Bike();
c.Laptop();

    
    }

}
