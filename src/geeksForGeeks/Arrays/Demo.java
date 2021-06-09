package geeksForGeeks.Arrays;

import javafx.beans.binding.StringExpression;

import java.beans.Expression;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

interface D {
    static void abc() {
        System.out.println("abc");
    }
}

public class Demo {
    int i;
    boolean flag;

    void s(){

    }

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[-]{0,1}[\\d+][+*xX/-][-]{0,1}\\d+$");
        Matcher matcher = pattern.matcher("-1*3");
        String[] s="3*3".split("^[+*xX/-]");
        for (int i=0;i<s.length;i++){
            System.out.println("s"+s[i]);
        }
        int j='1';
        System.out.println(j);
    }
}

class d extends Demo{
    public void s(){

    }
}
