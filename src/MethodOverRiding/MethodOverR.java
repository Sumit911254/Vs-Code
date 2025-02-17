package MethodOverRiding;

class ovrriding{
    public void add(int a,int b){
        System.out.println(a+b);
    }
}
class over extends ovrriding{
    public void add(int a,int b){
        System.out.println(a*b);
    }
}
class over1 extends ovrriding{
    public void add(int a,int b){
        System.out.println(a-b);
    } 
}

public class MethodOverR {
    public static void main(String[] args) {
        ovrriding ovr=new over();
        //ovr.add(3, 7);
       ovrriding ovr1=new over1();
       ovr1.add(12, 5);

    }

}
