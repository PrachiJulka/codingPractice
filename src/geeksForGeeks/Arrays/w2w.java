package geeksForGeeks.Arrays;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class De implements Comparable<De>{
    int a;
    int b;

    @Override
    public int compareTo(De o) {
         if(o.a==this.a){
          return 0;
         }
         else if(o.a>o.b){
             return 1;
         }
         else{
             return -1;
         }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        De de = (De) o;
        return a == de.a && b == de.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    public De(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

public class w2w {
    public static Date getNextDate(Date date, int numbers) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, numbers);
        return cal.getTime();
    }

    public static void main(String[] args) {
        De d=new De(1,2);
        De d1=new De(1,2);
        System.out.println(d.equals(d1));

        //System.out.println(w2w.getNextDate(new Date(),(180)));
    }
}
