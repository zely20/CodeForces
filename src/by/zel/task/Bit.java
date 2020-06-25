package by.zel.task;

import java.util.Scanner;

public class Bit {

    public static void main(String[] args) {

        int n = 0;
        String [] strings = null;
        int result = 0;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        strings = new String[n];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scan.next();
        }

        for(String i : strings) {
            if (i.charAt(1) == '+') {
                result++;
            } else {
                result--;
            }
        }
        System.out.println(result);
    }
}
