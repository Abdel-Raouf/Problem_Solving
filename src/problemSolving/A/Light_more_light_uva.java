package problemSolving.A;

import java.util.Scanner;

public class Light_more_light_uva {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         long no_of_bulbs = 1;

        for (long i = 0; i <= no_of_bulbs; i++) {
            no_of_bulbs = scanner.nextInt();
            long squareRoot = (long) Math.sqrt(no_of_bulbs); // casting to integer here to neglect decimal
            if (no_of_bulbs != 0) {
                System.out.println(squareRoot * squareRoot == no_of_bulbs ? "yes\n" : "no\n");
            }
        }
    }

}

