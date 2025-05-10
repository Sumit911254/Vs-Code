package Pholymorphism;

class poly{
    public void add(int a,int b){
        System.out.println(a+b);
    }
}
class over extends poly{
    public void add(int a,int b){
        System.out.println(a%b);
    }
}

class over1 extends poly{
    public void add(int a,int b){
        System.out.println(a*b);
    }

}


public class MethodOveRriding {

    public static void main(String[] args) {
        
// poly po=new over();
// po.add(2, 3);
poly po=new over1();
po.add(4, 2);



    }
}
