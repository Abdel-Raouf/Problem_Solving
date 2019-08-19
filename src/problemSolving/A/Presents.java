package problemSolving.A;

import java.util.Scanner;

public class Presents {
// not solved yet as we see backtracking as a technique
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int friends_petya_invited = scanner.nextInt();
        int gave_a_gift = 0;
        int counter = 0;

        for(int i = 0; i < friends_petya_invited; ++i){
            if(i >= 1){
                counter++;
            }
            gave_a_gift = scanner.nextInt();

        }

    }
}
