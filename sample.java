import java.util.*;

public class task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, i, a = 0, b = 0, ind = 0, max = 0;
        System.out.println("Enter the number of elements:");
        n = in.nextInt();
        System.out.println("Enter numbers one by one:");
        int[] arr = new int[n];
        int[][] ans = new int[n][n];
        for (i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (i = 0; i < n; i++) {
            if (i != n - 1) {
                if (arr[i] < arr[i + 1]) {
                    ans[a][b] = arr[i];
                    b++;
                } else {
                    ans[a][b] = arr[i];
                    a++;
                    b = 0;
                }
            } else {
                ans[a][b] = arr[i];
            }
        }
        for (i = 0; i < ans.length; i++) {
            int count = 0;
            for (int j = 0; j < ans[i].length; j++) {
                if (ans[i][j] != 0) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                ind = i;
            }
        }
       
        int[] result = new int[max];
        int index = 0;
        for (int j = 0; j < ans[ind].length; j++) {
            if (ans[ind][j] != 0) {
                result[index] = ans[ind][j];
                index++;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}

