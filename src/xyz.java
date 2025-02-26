import java.util.HashMap;

public class xyz {
public static void main(String[] args) {

int num=1234;
String str=Integer.toString(num);
String rev="";
for(int i=str.length()-1;i>=0;i--){
    char c=str.charAt(i);
    rev=rev+c;
}
System.out.println(rev);


}
}
