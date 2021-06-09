package geeksForGeeks.Arrays.recurssion;

public class ReverseString {
    public static void reverseString(char[] s) {

        reverseHelp(s,0,s.length-1);


    }


    static void reverseHelp(char[] s,int start,int end){
        if(start>=end){
            return;
        }
        else{
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            reverseHelp(s,++start,--end);
        }
    }

    public static void main(String[] args) {
        char[] str=new char[]{'h','e','l','l','o'};
        ReverseString.reverseString(str);
        System.out.println(str);
    }
}
