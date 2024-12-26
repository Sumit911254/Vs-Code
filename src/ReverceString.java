public class ReverceString {
    public static void main(String[] args) {
        String str="Hello Moto";
        char c[]=str.toCharArray();
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        } 

    }

}
