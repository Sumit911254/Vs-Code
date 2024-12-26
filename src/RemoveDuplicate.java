import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        
int arr[]={1,1,2,2,3,3,4,4,5,5};

Set<Integer>s=new HashSet<Integer>();
for(int c:arr){
    s.add(c);
}
String rem="";
for(int c:s){
    rem=rem+c+"";

}
System.out.println(rem);


    }

}
