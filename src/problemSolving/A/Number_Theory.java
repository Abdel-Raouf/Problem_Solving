package problemSolving.A;

import java.util.Scanner;

public class Number_Theory {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
// if we make it on clock we can put, a=9p.m , n=12 as clock cycle , if a is -ve number(as we want to calculate time from now to yesterday)
//  we need to add 12 hour on the reminder to get the hour in yesterday time.
        int reminder = a - n * Math.toIntExact(a/n);

        System.out.println(reminder + 12);
    }
}
