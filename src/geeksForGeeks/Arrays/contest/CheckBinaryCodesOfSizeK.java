package geeksForGeeks.Arrays.contest;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashMap;
import java.util.Map;

public class CheckBinaryCodesOfSizeK {

    static void printTheArray(StringBuffer binaryCode, int n)
    {

    }

    // Function to generate all binary strings
    static void generateAllBinaryStrings(int n,
                                         StringBuffer binaryCode, Map<String, Boolean> result)
    {
        for (int i = 0; i < Math.pow(2, n); i++)
        {
            // To add in the list all possible
            // binary sequence of given length
            result.put(String.format("%0" + n + "d",
                    Integer.valueOf(Integer.toBinaryString(i))),false);

            /* To Show all binary sequence of given
               length k
            System.out.println(String.format(format,
            Integer.valueOf(Integer.toBinaryString(i))));*/
        }
    }



    // Driver Code
    public static void main(String args[])
    {
        int n = 2;
        String s="0011";
        int[] arr = new int[n];
        Map<String, Boolean> result=new HashMap<>();
        StringBuffer binaryCode=new StringBuffer();

        // Print all binary strings
        generateAllBinaryStrings(n,binaryCode,result);
        for (int i=0;i<=s.length()-n;i++){
            String check=s.substring(i,i+n);
            if(result.containsKey(check))
                result.put(check,true);
        }

        for (Map.Entry<String,Boolean> map:result.entrySet()){
            if(!map.getValue()){
                System.out.println(false);
                break;
            }
                }
    }
}
