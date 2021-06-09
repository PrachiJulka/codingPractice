package geeksForGeeks.Arrays.Strings;

public class IsRotation {


    public static void main(String[] args) {
      String s1="waterbottle";
      String s2="erbottlewat";
        System.out.println(isRotation(s1,s2));
    }
   static boolean isRotation(String s1,String s2) {
        return (s1.length() == s2.length()) && ((s2+s2).indexOf(s1) != -1);
    }
}
