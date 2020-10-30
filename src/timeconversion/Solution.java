package timeconversion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String ampm = s.substring(8);
        String[] time = s.substring(0, 8).split(":");
        int hour = Integer.parseInt(time[0]) % 12;
        if (ampm.equals("AM")) {
            return unifyFormat(hour) + ":" + time[1] + ":" + time[2];
        } else {
            return (hour + 12) + ":" + time[1] + ":" + time[2];
        }
    }

    static String unifyFormat(int time) {
        if (time < 10) {
            return "0" + time;
        } else {
            return time + "";
        }
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);
        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
