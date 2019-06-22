package problemSolving.A;

import java.util.Scanner;

public class Games {

//    brute force using loops to try every possible value in two arrays.
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int number_of_matches = scanner.nextInt();
        int[] home = new int[number_of_matches];
        int[] away = new int[number_of_matches];
        int counter = 0;

        for(int i = 0; i < number_of_matches; i++){
            home[i] = scanner.nextInt();
            away[i] = scanner.nextInt();
        }

        for(int i = 0; i < number_of_matches; i++){
            for(int x = 0; x < number_of_matches; x++) {
                if(home[i] == away[x]){
                    counter++;
                }
            }
        }

        System.out.println(counter); // arrays don't override toString() so if you try to print one directly, you get the className + @ + the hex of the hashCode of the array.
        // Arrays.toString(matches_array) , so we need to use the Arrays util library then toString() to override the implicit toString() from the println
    }
}
