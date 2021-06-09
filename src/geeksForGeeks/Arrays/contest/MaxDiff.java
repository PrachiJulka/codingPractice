package geeksForGeeks.Arrays.contest;

public class MaxDiff {
    public static int maxDiff(int num) {
        int max=num,min=num;
        String n="wwww";
        char lead;
        for (int i=9;i>=0;i--){
            String numS=String.valueOf(num);
            for (int j=0;j<numS.length();j++) {
                numS=String.valueOf(num);
                numS=numS.replaceAll(String.valueOf(numS.charAt(j)),String.valueOf(i));
                int newNum=Integer.parseInt(numS);
                if(newNum>max)
                    max=newNum;
            }
        }
        for (int i=0;i<=9;i++){
            String numS=String.valueOf(num);
            for (int j=0;j<numS.length();j++) {
                numS=String.valueOf(num);
                lead=numS.charAt(0);
                if (lead!=numS.charAt(j) || i!=0) {
                    numS = numS.replaceAll(String.valueOf(numS.charAt(j)), String.valueOf(i));
                    int newNum = Integer.parseInt(numS);
                    if (newNum < min)
                        min = newNum;
                }
            }
        }

        return max-min;
    }

    public static void main(String[] args) {
        System.out.println(maxDiff(0));
    }
}
