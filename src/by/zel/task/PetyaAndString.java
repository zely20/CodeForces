package by.zel.task;

import java.util.Scanner;

public class PetyaAndString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String one = scan.next();
        String two = scan.next();
        int result = 0;

        for (int i = 0; i < one.length(); i++) {
            if(Character.getNumericValue(one.charAt(i)) < Character.getNumericValue(two.charAt(i))){
                result = -1;
                break;
            }else if(Character.getNumericValue(one.charAt(i)) > Character.getNumericValue(two.charAt(i))) {
                result = 1;
                break;
            }
        }
        System.out.println(result);
    }
}
