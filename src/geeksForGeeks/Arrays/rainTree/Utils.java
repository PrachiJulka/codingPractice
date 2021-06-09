package geeksForGeeks.Arrays.rainTree;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;

public class Utils {
    static String pathToFile = "/home/prachi/Downloads/RT Test/H--RAINTREE-PARKER94-";
    static String nameToReplace = "ComputerName:";

    //method to change the pattern of date and save string into date
    static Date changePattern(String date, String year) {
        StringBuilder stringBuilder = new StringBuilder(formatString(date, year));
        if (year!=null) {
            stringBuilder.insert(0, date.substring(4, 6) + "/");
            stringBuilder.delete(5, 8);
            stringBuilder.insert(5, "/" + year);
        }
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            return formatter.parse(stringBuilder.toString());
        } catch (Exception e) {
            System.out.println("exception" + e.getMessage());
        }
        return null;
    }

    //remove whitespaces and circular brackets from date of a file
    static String formatString(String date, String year) {
        return date.replace("(", "").replace(")", "").trim();
    }

    //check if date entered by user is in correct format or not
    public static boolean isDate(String date) {
        Matcher matcher = PatternType.getPattern(PatternType.DATE).matcher(date);
        if (matcher.find()) {
            return true;
        } else
            return false;

    }


}
