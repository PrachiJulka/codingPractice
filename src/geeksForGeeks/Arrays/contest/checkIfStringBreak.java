package geeksForGeeks.Arrays.contest;

public class checkIfStringBreak {
//    public boolean checkIfCanBreak(String s1, String s2) {
//
//    }

    void stringPermutation(String str, String ans,String str2,String ans2,int k)
    {

        if(ans.charAt(k)>ans2.charAt(k))

        // If string is empty
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;

        }


        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char ch = str.charAt(i);
            char ch1=str.charAt(i);

            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) +
                    str.substring(i + 1);

            String ros1=str2.substring(0,i)+str2.substring(i+1);

            // Recurvise call
            stringPermutation(ros, ans + ch,ros1,ans2+ch,i);
        }
    }
}
