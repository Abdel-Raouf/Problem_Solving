package problemSolving.A;

import java.util.Scanner;

public class Stones_on_the_Table {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int no_of_stones = scanner.nextInt();

        char[] stones = scanner.next().toCharArray(); // important to convert from string to characters when inserting a string inside an array.

        int counter = 0;
        for(int i = 0; i < no_of_stones - 1; i++){

            if(stones[i] == stones[i+1]){
                counter++;
            }
        }

        System.out.println(counter);
    }
}
