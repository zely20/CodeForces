package by.zel.task;

import java.util.Scanner;

public class Arbuz {

    public static void main(String[] args) {

        int n = 0;
        String result = "NO";
        try  {
            Scanner scan = new Scanner(System.in);
            n = scan.nextInt();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        for (int i = 1; i <= n / 2; i++) {
            int remainder = 0;
            remainder = n - i;
            if(remainder%2 == 0 && i%2 == 0) {
                result = "YES";
                break;
            }
        }
        System.out.println(result);
    }
}
