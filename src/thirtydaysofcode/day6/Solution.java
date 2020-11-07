package thirtydaysofcode.day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tcNum = Integer.parseInt(br.readLine());
        for (int i = 0; i < tcNum; i++) {
            char[] arr = br.readLine().toCharArray();
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < arr.length; j += 2) {
                sb.append(arr[j]);
            }
            sb.append(" ");
            for (int j = 1; j < arr.length; j += 2) {
                sb.append(arr[j]);
            }
            System.out.println(sb.toString());
        }
    }
}