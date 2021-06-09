package geeksForGeeks.Arrays.contest;

import java.util.ArrayList;
import java.util.List;

public class CountLargestGroup {
    public static void main(String[] args) {
        List<List<Integer>> lists=new ArrayList<>();
        int n=24,temp,sum=0;
        int v=n,size=0,no=0;
        for (int i=1;i<=n;i++) {
            v=i;
            no=0;
            sum=0;
            List<Integer> l=new ArrayList<>();
            if(size==0){
                size++;
            }
            if(i>=10)
                l.add(i);
            while (true) {
                no++;

                        temp = v % 10;
                        sum+=temp;
                        v/=10;

                        if(v==0 && sum<10){
                            l.add(sum);
                            break;
                        }
                        else if(v==0 && sum>10){
                            v=sum;
                            l.add(sum);
                            sum=0;
                        }


            }
            if (size<no){
                size=no;
            }
            lists.add(l);
        }
        no=0;
        for (int i=0;i<lists.size();i++){
            System.out.println("ww"+lists.get(i).size());
            if (lists.get(i).size()==size){
                no++;
            }
        }
        System.out.println(no);



    }

}
