package by.zel.task;

import java.util.Scanner;

public class Team {

    public static void main(String[] args) {
        int count;
        int result = 0;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] array = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < 3; j++) {
               if (array[i][j] == 1) {
                   count++;
               }
            }
            if (count > 1) {
                result++;
            }
        }
        System.out.println(result);
    }
}
