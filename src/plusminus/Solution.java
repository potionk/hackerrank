package plusminus;

import java.util.Scanner;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        double arrLen = arr.length;
        int positive = 0, negative = 0, zero = 0;
        for (int i : arr) {
            if (i == 0) {
                zero++;
            } else {
                if (i > 0) {
                    positive++;
                } else {
                    negative++;
                }
            }
        }
        System.out.println(positive/arrLen);
        System.out.println(negative/arrLen);
        System.out.println(zero/arrLen);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
