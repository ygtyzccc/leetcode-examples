package arrayleftrotation;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);

        System.out.print("d?");
        int d = Integer.parseInt(kb.nextLine());
        Integer [] a = {1, 2, 3, 4, 5};

        List<Integer> result = Result.rotateLeft(d, Arrays.asList(a));

        result.stream().forEach(i -> System.out.printf("%d ", i));


    }
}