public class ReverceInteger {
    public static void main(String[] args) {
        int num=12345;
        String str=Integer.toString(num);
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            char c=str.charAt(i);
            rev =rev+c;
        }
System.out.println(rev);

    }

}
