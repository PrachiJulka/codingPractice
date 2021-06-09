package geeksForGeeks.Arrays;


import java.util.*;

public class ComplexNumber {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
        int cases = sc.nextInt();
        int c = 0;
        while (cases > 0) {
            c = sc.nextInt();
            int t=c;
            int val1=1,val2=1;
            while (c > 0) {
                int value1=sc.nextInt();
                int value2=sc.nextInt();
                if(c==t){
                    val1=value1;
                    val2=value2;
                }
                else {
                    int temp = val1;
                    val1 = val1 * value1 + (-val2 * value2);
                    val2 = temp * value2 + val2 * value1;
                }
                c--;
            }
            System.out.println(val1+" "+val2);


            cases--;
        }
    }
}
