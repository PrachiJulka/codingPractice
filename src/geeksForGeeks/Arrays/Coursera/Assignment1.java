package geeksForGeeks.Arrays.Coursera;

import java.io.*;

public class Assignment1 {
    private int[] ids;
    private int[] rootConnected;
    private int count;
    private File logsFile;
    private int[] max;

    public Assignment1(int N,File logsFile)  {
        this.count = N;
        this.ids = new int[count] ;
        this.rootConnected = new int[count];
        this.logsFile = logsFile;
        this.max=new int[count];
        for(int i=0;i<N;i++){
            ids[i]=i;
            rootConnected[i]=1;
            max[i]=i;
        }

    }

    public void connectAndDisplayEarliestTime() throws IOException{
        BufferedReader reader=null;
        try (FileInputStream fileInputStream=new FileInputStream(logsFile)) {
            reader=new BufferedReader(new InputStreamReader(fileInputStream));
           String line=reader.readLine();
            while (line!=null && !line.trim().equals("")){
                String[] words=reader.readLine().split(" ");
                int a=Integer.parseInt(words[0]);
                int b=Integer.parseInt(words[1]);
                union(a,b);
                if(count==1){
                    System.out.println(words[2]);
                }
            }
        }


    }

    public void union(int p,int q){
        int pId = find(p);
        int qId = find(q);

        if(pId == qId){
            return;
        }
        if(rootConnected[pId] < rootConnected[qId]){
            ids[pId] = qId;
            rootConnected[qId] += rootConnected[pId];
            max[qId] = max[pId] > max[pId] ? max[pId] : max[qId];
        }else{
            ids[qId] = pId;
            rootConnected[pId] += rootConnected[qId];
            max[pId] = max[pId] > max[qId] ? max[pId] : max [qId];
        }
        count--;
    }

    public int getMax(int i){
        return max[find(i)];
    }
    public int find(int i){
        while(ids[i] != i){
            i = ids[i];
        }
        return i;
    }

    public static void main(String[] args) throws IOException {


            File file=new File("SocialNetworkingData");
            Assignment1 assignment1=new Assignment1(10,file);
            assignment1.connectAndDisplayEarliestTime();

    }

}
