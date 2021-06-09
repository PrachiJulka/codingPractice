package geeksForGeeks.Arrays.sorting;

public class QuickSort {

    int sort(int[] arr, int start, int end,int k) {
        if(start<end) {
            int index = partioning(arr, start, end,k);
            if(index==k-1)
                return arr[index];
            if(index>k-1)
            return sort(arr, start, index,k);
            else
            return sort(arr, index + 1, end,k);
        }
        return 0;
    }



    int partioning(int[] arr,int start,int end,int k){
        int index=start;
        int pivot=arr[end-1];
        for(int i=start;i<end;i++){
            if(arr[i]>pivot){
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
                index++;
            }
        }

        int temp=arr[index];
        arr[index]=pivot;

        arr[end-1]=temp;
        return index;

    }

    public static void main(String[] args) {
        int[] arr={2,4,1,6,5,10};
        QuickSort quickSort=new QuickSort();
            int a=quickSort.sort(arr,0,arr.length,4);
            System.out.println(a);
        System.out.println("__________");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }



}
