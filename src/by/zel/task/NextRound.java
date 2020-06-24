package by.zel.task;

import java.util.Scanner;

public class NextRound {

    public static void main(String[] args) {
        int n = 0;
        int k = 0;
        int[] array;
        int result = 0;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        k = scan.nextInt();
        array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        result = k;

        if (array[k-1] == 0) {
            int count = 0;
            for (int i = 0; i < array.length; i++) {
               if (array[i] > 0) {
                   count++;
               }
            }
            result = count > 0 ? count : 0;
        } else {

            for (int i = k; i < array.length; i++) {
                if (array[k - 1] == array[i]) {
                    result += 1;
                }
            }
        }
        System.out.println(result);
    }
}
