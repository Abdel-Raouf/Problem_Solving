package problemSolving.A;

import java.util.Scanner;

public class Black_Square {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int[] screen_strips_arr  = new int[4];

        for(int i = 0; i < 4; i++){
            screen_strips_arr[i] = scanner.nextInt();
        }

        char[] black_squares = scanner.next().toCharArray(); // will return a number in a char, to use it we need to convert it to a string then to parseint it to get the number in the char position as an integer.
        int counter = 0;

        for(int x = 0; x < black_squares.length; x++){
            counter += screen_strips_arr[Integer.parseInt(String.valueOf(black_squares[x])) - 1];
        }

        System.out.println(counter);
    }
}
