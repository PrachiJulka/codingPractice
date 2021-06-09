package geeksForGeeks.Arrays.StackAndQueue;

import java.util.Stack;

public class BalancedParaenthesis {


    public static boolean checkValidString(String s) {
        java.util.Stack<Character> stackLeft= new java.util.Stack<Character>();
        Stack<Character> stackRight=new Stack<>();
        if(s.isEmpty() ||s.length()==0)
            return true;

        if(s.charAt(0)!='('&&s.charAt(0)!=')'&&s.charAt(s.length()-1)!='*'&&s.charAt(0)!='*')
            return false;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' ||((s.length()-1)/2)<=i && s.charAt(i)=='*')
                stackLeft.add(s.charAt(i));
            else
                stackRight.add(s.charAt(i));
        }

        while(!stackLeft.empty()&&!stackRight.empty()){
            Character c=stackRight.pop();
           if (c==')' || c=='*')
               stackLeft.pop();
           else
               return false;

        }
        int countAlpha=0,countStar=0;

        if (!stackLeft.empty()&&!stackLeft.contains('*')){
            return false;
        }

        else if (!stackRight.empty()){

            while(!stackRight.empty()){
                Character c=stackRight.pop();
              if(c==')'||c=='(')
                  return false;
              else if(c!='*')
                  countAlpha++;
              else
                  countStar++;
            }

        }

        if(countAlpha!=0 && countStar!=0)
            return false;
        else
            return true;




    }

    public static void main(String[] args) {
       boolean fl= checkValidString("(*)");
        System.out.println(fl);
    }




}
