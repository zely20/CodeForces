package by.zel.task;

import java.util.Scanner;

public class MoreLongWorld {

    public static void main(String[] args) {
        int n = 0;
        String [] strings = null;

            Scanner scan = new Scanner(System.in);
            n = scan.nextInt();
            strings = new String[n];
            for (int i = 0; i < strings.length; i++) {
                strings[i] = scan.next();
            }

        for (String world : strings) {
            if(world.length() > 10) {
                StringBuilder result = new StringBuilder();
                result.append(world.charAt(0)).append(world.length() - 2).append(world.charAt(world.length()-1));
                System.out.println(result);
            } else {
                System.out.println(world);
            }
        }
    }
}
