package problemSolving.A;

import java.util.Scanner;

public class Number_Theory {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); // a= -15
        int n = scanner.nextInt(); // cycle = 12
// if we make it on clock we can put, a=9 p.m , n=12 as clock cycle , if a is -ve number(as we want to calculate time from now to yesterday)
        int reminder = a - (n * Math.toIntExact(a/n));
        int reminder_plus_n = (reminder + n);
        int modulo = reminder_plus_n - (n * Math.toIntExact(reminder_plus_n/n));
        System.out.println(modulo);
    }
}
