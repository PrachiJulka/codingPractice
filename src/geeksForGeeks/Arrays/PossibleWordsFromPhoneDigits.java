package geeksForGeeks.Arrays;

/*
Given a keypad as shown in diagram, and an N digit number. List all words which are possible by pressing these numbers.

        Input:
        The first line of input contains an integer T denoting the number of test cases. T testcases follow.
         Each testcase contains two lines of input. The first line of each test case is N, N is the number of digits.
         The second line of each test case contains D[i], N number of digits.

        Output:
        Print all possible words from phone digits with single space in lower case.

        Constraints:
        1 <= T <= 10
        1 <= N <= 10
        2 <=  D[i] <= 9

        Example:
        Input:
        1
        3
        2 3 4

        Output:
        adg adh adi aeg aeh aei afg afh afi bdg bdh bdi beg beh bei bfg bfh bfi cdg cdh cdi ceg ceh cei cfg cfh cfi
*/


import java.util.Scanner;

public class PossibleWordsFromPhoneDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int N=sc.nextInt();
        int[] num=new int[N];

    }
}
