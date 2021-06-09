package geeksForGeeks.Arrays.sorting;

public class MergeSort {

    void mergeSort(int[] array){

        int n;
        n=array.length;
        if(n<2)
            return;
        else {
            int mid=n/2;
            int left=mid;
            int right=n-(mid);
            int[] arrLeft=new int[left];
            int[] arrRight=new int[right];
            for (int i=0;i<left;i++){
                   arrLeft[i]=array[i];
            }

            for (int j=mid;j<n;j++){
                arrRight[j-mid]=array[j];
            }

            mergeSort(arrLeft);
            mergeSort(arrRight);
            merge(arrLeft,arrRight,array);

        }




    }

    void merge(int[] l,int[] r,int[] arr){
        int i=0,j=0,k=0;
        while(i<l.length && j<r.length){
            if(l[i]<=r[j]){
                arr[k]=l[i];
                i++;
            }
            else {
                arr[k]=r[j];
                j++;
            }
            k++;
        }

        if(i<l.length){
            for (int m=i;m<l.length;m++){
                arr[k]=l[m];
            k++;
            }

        }
        else if (j<r.length){
            for (int m=j;m<r.length;m++){
                arr[k]=r[m];
                k++;
            }
        }


    }

    public static void main(String[] args) {
        MergeSort mergeSort=new MergeSort();
        int arr[]={2,5,1,1,5,6};
        mergeSort.mergeSort(arr);

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }




}
