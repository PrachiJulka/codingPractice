package geeksForGeeks.Arrays.rainTree;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GenerateReport {

    String dateFrom;
    String dateTo;
    Matcher matcher;
    Map<String, Integer> mapDisconnectionCount;
    Map<String, Integer> mapDropCounts;
    Map<String, Integer> mapAvgLimitCounts;

    public GenerateReport() {
        mapDisconnectionCount = new HashMap<>();
        mapDropCounts = new HashMap<>();
        mapAvgLimitCounts = new HashMap<>();
    }


    public void generateReportFromLogs() {
        System.out.println("Enter Date From and To");
        Scanner sc = new Scanner(System.in);
        this.dateFrom = sc.next();
        this.dateTo = sc.next();
        //check date entered by user is in correct format
        if (Utils.isDate(dateFrom) && Utils.isDate(dateTo)) {
            File[] dir = new File(Utils.pathToFile).listFiles();
            //convert string to date
            Date dateFromClient = Utils.changePattern(dateFrom, null);
            Date dateToClient = Utils.changePattern(dateTo, null);

            if (dir != null) {
                for (File file : dir) {
                    try (FileInputStream fileInputStream = new FileInputStream(file)) {
                        //fetch data from file line by line and save it into maps
                        fetchAndSaveReports(fileInputStream, dateFromClient, dateToClient);
                    } catch (Exception e) {
                        System.out.println("Exception" + e.getMessage());
                    }

                }
            }
            //sort and display data in descending format
            sortAndGenerateDisconnectedCounts(new ArrayList<>(this.mapDisconnectionCount.entrySet()));
            sortAndGenerateDropCounts(new ArrayList<>(this.mapDropCounts.entrySet()));
            sortAndGenerateAvgCounts(new ArrayList<>(this.mapAvgLimitCounts.entrySet()));

        } else {
            System.out.println("Please enter date in dd/MM/yyyy format");
        }
    }


    boolean addCount(Map<String, Integer> mapCount, String nameOfComputer, PatternType patternType, String line) {
        boolean isFound=false;
        Pattern pattern = PatternType.getPattern(patternType);
        Matcher matcher = pattern.matcher(line);
        if (matcher.find()) {
            isFound=true;
            if (mapCount.containsKey(nameOfComputer)) {
                mapCount.put(nameOfComputer, mapCount.get(nameOfComputer) + 1);
            } else {
                mapCount.put(nameOfComputer, 1);
            }
        }
        return isFound;
    }


    public void sortAndGenerateDisconnectedCounts(List<Map.Entry<String, Integer>> disconnectedCountsList) {
        Collections.sort(disconnectedCountsList, new SortInDescendingOrder());
        System.out.println("***********Disconnected List*************");
        System.out.println("Name" + "    " + "Count");
        for (Map.Entry<String, Integer> disconnectedMap : disconnectedCountsList) {
            System.out.println(disconnectedMap.getKey() + "    " + disconnectedMap.getValue());
        }
    }

    public void sortAndGenerateDropCounts(List<Map.Entry<String, Integer>> dropCountList) {
        Collections.sort(dropCountList, new SortInDescendingOrder());
        System.out.println("***********Drop Count List*************");
        System.out.println("Name" + "    " + "Count");
        for (Map.Entry<String, Integer> dropCount : dropCountList) {
            System.out.println(dropCount.getKey() + "    " + dropCount.getValue());
        }
    }

    public void sortAndGenerateAvgCounts(List<Map.Entry<String, Integer>> avgCountList) {
        Collections.sort(avgCountList, new SortInDescendingOrder());
        System.out.println("**********Avg Count List*************");
        System.out.println("Name" + "    " + "Count");
        for (Map.Entry<String, Integer> avgCount : avgCountList) {
            System.out.println(avgCount.getKey() + "    " + avgCount.getValue());
        }
    }

    public String getComputerName(String line) {
        String nameOfComputer = "";
        Pattern pattern = PatternType.getPattern(PatternType.NAME);
        Matcher matcher = pattern.matcher(line);
        if (matcher.find())
            nameOfComputer = matcher.group(0).replace(Utils.nameToReplace, "").trim();

        return nameOfComputer;

    }

    public void fetchAndSaveReports(FileInputStream fileInputStream, Date dateFromClient, Date dateToClient) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(fileInputStream));
        String strLine, nameOfComputer = "";
        Date dateFromFile = new Date();
        Date dateToFile = new Date();
        while ((strLine = br.readLine()) != null) {
            nameOfComputer = getComputerName(strLine);
            this.matcher = PatternType.getPattern(PatternType.FILE_DATE).matcher(strLine);
            if (this.matcher.find()) {
                String s[] = this.matcher.group(0).split("-");
                dateFromFile = Utils.changePattern(s[0], this.dateFrom.substring(6).trim());
                if (s.length > 1)
                    dateToFile = Utils.changePattern(s[1], this.dateTo.substring(6).trim());
                else
                    dateToFile = null;
            }
            if (dateToFile == null ? ((dateFromFile.equals(dateFromClient) || dateFromFile.after(dateFromClient)) && (dateFromFile.before(dateToClient) || dateFromFile.equals(dateToClient)))
                    : ((dateFromFile.equals(dateFromClient) || dateFromFile.after(dateFromClient)) && (dateToFile.equals(dateToClient) || dateToFile.before(dateToClient)))
            ) {

                if (!addCount(this.mapDisconnectionCount, nameOfComputer, PatternType.DISCONNECTED, strLine))
                    if (!addCount(this.mapDropCounts, nameOfComputer, PatternType.DROP_COUNT, strLine))
                        addCount(this.mapAvgLimitCounts, nameOfComputer, PatternType.AVG_LIMIT, strLine);
            }
        }
    }


    public static void main(String[] args) {
        GenerateReport generateReport = new GenerateReport();
        generateReport.generateReportFromLogs();

    }


}
