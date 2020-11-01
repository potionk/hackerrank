package thirtydaysofcode.day1;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+scan.nextInt());
        /* Print the sum of the double variables on a new line. */
        System.out.println(d+scan.nextDouble());
        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        StringBuilder sb=new StringBuilder();
        sb.append(s);
        while(scan.hasNext()){
            sb.append(scan.next());
            sb.append(" ");
        }
        System.out.println(sb.toString());
        scan.close();
    }
}