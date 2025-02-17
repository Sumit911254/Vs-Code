
class over{
    public void sum(int a,int b){
        System.out.println(a+b);

    }
}
class ride1 extends over{
    public void sum(int a,int b){
        System.out.println(a-b);
    }
}
class ride2 extends over{
    public void sum(int a,int b){
        System.out.println(a*b);
    }
}


public class Classfinal {
public static void main(String[] args) {

    over ov=new ride2();
    ov.sum(2, 5);

}

}
