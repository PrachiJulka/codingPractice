package geeksForGeeks.Arrays;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int elementToSearch = sc.nextInt();
        int position = findMiddle(arr, 0, N - 1, elementToSearch);

        System.out.println("Element Found at Position" + position+1);


    }

    private static int findMiddle(int arr[], int left, int right, int elementToSearch) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            System.out.println(mid);

            if (arr[mid] == elementToSearch) {
                return mid;
            }
            else if (arr[mid] > elementToSearch) {
                return findMiddle(arr, left, mid - 1, elementToSearch);
            } else {
                return findMiddle(arr, mid + 1, right, elementToSearch);
            }

        }
        return -1;

    }


}
