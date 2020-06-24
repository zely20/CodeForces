package by.zel.task;

import java.util.Scanner;

public class Domino {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int result = 0;
        result = n*m/2;

        System.out.println(result);

    }
}
