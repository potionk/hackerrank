package comparethetriplets;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int[] result = new int[2];
        int getA, getB;
        for (int i = 0; i < 3; i++) {
            getA = a.get(i);
            getB = b.get(i);
            if (getA > getB) {
                result[0]++;
            } else if (getB > getA) {
                result[1]++;
            }
        }
        List<Integer> resultList = new LinkedList<>();
        resultList.add(result[0]);
        resultList.add(result[1]);
        return resultList;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = compareTriplets(a, b);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
