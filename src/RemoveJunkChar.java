public class RemoveJunkChar {
    public static void main(String[] args) {
        String str="S#U*M%I#T!K*U%M@A!R";
        str=str.replaceAll("[^A-Z,a-z,0-9]", "");
        System.out.println(str);

    }

}
 