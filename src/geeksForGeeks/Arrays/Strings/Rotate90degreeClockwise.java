package geeksForGeeks.Arrays.Strings;

public class Rotate90degreeClockwise {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        int N = arr.length;
        rotateMatrix(arr, N);
        printMatrix(arr, N);

    }

    public static int[][] rotateMatrix(int[][] arr, int N) {
        for (int i = 0; i < N / 2; i++) {
            for (int j = i; j < N - i - 1; j++) {
                int temp;
                temp = arr[i][j];
                arr[i][j] = arr[N - 1 - j][i];
                arr[N - 1 - j][i] = arr[N - 1 - i][N - 1 - j];
                arr[N - 1 - i][N - 1 - j] = arr[j][N - 1 - i];
                arr[j][N - 1 - i] = temp;
            }
        }

        return arr;
    }

    public static void printMatrix(int[][] arr, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }

    }
}
