import java.util.HashMap;

public class xyz {
public static void main(String[] args) {
String str="ugduiqgdhgqhd";
int len=str.length();
HashMap<Character,Integer>hm=new HashMap<>();
for(int i=0;i<len;i++){
    char c=str.charAt(i);
    if(hm.containsKey(c)){
        hm.put(c,hm.get(c) +1);
    }
    else{
        hm.put(c, 1);
    }
   
}
for(Character c: hm.keySet()){
    System.out.println(c+""+hm.get(c));
}


}
}
