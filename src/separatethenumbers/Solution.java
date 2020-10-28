package separatethenumbers;

import java.util.Scanner;

public class Solution {

    // Complete the separateNumbers function below.
    static void separateNumbers(String s) {
        int sLen = s.length();
        int firstLen = 1;
        long result;
        while (firstLen <= sLen / 2) {
            long num = Long.parseLong(s.substring(0, firstLen));
            result = num;
            int idx = firstLen;
            String str;
            boolean isCorrect = true;
            while (true) {
                if (idx > sLen) {
                    isCorrect = false;
                    break;
                } else if (idx == sLen) {
                    break;
                }
                str = (num + 1) + "";
                num = (num + 1);
                int nextLen = str.length();
                if (idx + nextLen > sLen) {
                    isCorrect = false;
                    break;
                }
                if (str.equals(s.substring(idx, idx + nextLen))) {
                    idx += nextLen;
                } else {
                    isCorrect = false;
                    break;
                }
            }
            if (!isCorrect) {
                firstLen++;
            } else {
                System.out.println("YES " + result);
                return;
            }
        }
        System.out.println("NO");
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();
            separateNumbers(s);
        }
        scanner.close();
    }
}
