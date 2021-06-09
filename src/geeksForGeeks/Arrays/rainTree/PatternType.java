package geeksForGeeks.Arrays.rainTree;

import java.util.regex.Pattern;

public enum PatternType {
        DISCONNECTED ("disconnected"),
        AVG_LIMIT("Drop count"),
        DROP_COUNT("Average limit"),
        NAME("ComputerName:[A-Za-z!-_@#$%^&*(),.?:{}|<>]*"),
        FILE_DATE("(\\([\\d*:\\-\\/ ]*\\))"),
        DATE("^\\d{2}/\\d{2}/\\d{4}$");

    String value;

    PatternType(String value) {
        this.value = value;
    }

    public static Pattern getPattern(PatternType patternType) {
        Pattern pattern = null;
        switch (patternType) {
            case AVG_LIMIT:
                pattern = Pattern.compile(PatternType.AVG_LIMIT.value);
                break;
            case DROP_COUNT:
                pattern = Pattern.compile(PatternType.DROP_COUNT.value);
                break;
            case DISCONNECTED:
                pattern = Pattern.compile(PatternType.DISCONNECTED.value);
                break;
            case NAME:
                pattern = Pattern.compile(PatternType.NAME.value);
                break;
            case FILE_DATE:
                pattern = Pattern.compile(PatternType.FILE_DATE.value);
                break;
            case DATE:
                pattern = Pattern.compile(PatternType.DATE.value);
                break;
        }
        return pattern;

    }

}
