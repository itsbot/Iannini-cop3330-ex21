/*
 *  UCF COP3330 Fall 2021 Exercise 21 Solution
 *  Copyright 2021 Patrick Iannini
 */
package Exercise21;
import java.time.Month;
import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        System.out.println("Please enter the number of the month: ");
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            System.out.println("Please enter a valid month");
            sc.next();
        }
        int num = sc.nextInt();
        while (num<1||num>12) {
            System.out.println("Please enter a valid month");
            num = sc.nextInt();
        }
        Month month = Month.of(num);
        System.out.println("The name of the month is "+month);
    }
}
