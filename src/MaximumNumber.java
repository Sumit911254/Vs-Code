public class MaximumNumber {
public static void main(String[] args) {
    int arrys[]={1,23,239,24,3,35,3,4};
    int max=arrys[0];
    for(int i=1;i<arrys.length;i++){
        if(max<arrys[i]){
            max=arrys[i];
        }
    }
    System.out.println(max);

}
}
