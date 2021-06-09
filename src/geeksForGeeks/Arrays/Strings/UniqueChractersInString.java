package geeksForGeeks.Arrays.Strings;/*
Implement an algorithm to determine if a string has all unique characters. What if you
        cannot use additional data structures*/


public class UniqueChractersInString {

    public static void main(String[] args) {
        String str="abcdd";
        char[] stringChar;
        stringChar=str.toCharArray();
        boolean flag=false;
        int check=2;
        for (int i=0;i<stringChar.length;i++){
            for (int j=i+1;j<stringChar.length;j++){
                System.out.println((check & 1<<(stringChar[1]-'a'))>0);
                if (stringChar[i]==stringChar[j]){
                    flag=true;
                    break;
                }
             }
            if (flag) {
                System.out.println("No");
                break;
            }

        }
        if (!flag)
            System.out.println("Yes");

    }
}
