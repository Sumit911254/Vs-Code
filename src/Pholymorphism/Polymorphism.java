package Pholymorphism;

public class Polymorphism {

public void Company(int a,int b){
    System.out.println("HCL");
}
public void Company(String a,int b ){
    System.out.println("Cozingent");
}
public void Company(String a,String b){

    System.out.println("Botex AI ");
}
public void Company(String a,int b,String c){
    System.out.println("Legelx Pvt. Ltd");
}
public void Company(int a,String b){
    System.out.println("Teceon Softwere");
}
public void Company (int a ){
    System.out.println("Capegeminy");
}
public void Company(String a){
    System.out.println("TCS");
}
public static void main(String[] args) {
    
    Polymorphism po=new Polymorphism();
    
   // po.Company("co");
    // po.Company(21, "hello");
    // po.Company("hii", "sumit");
    // po.Company("raj", 3, "hii");



}





}
