package problemSolving.A;

import java.util.Scanner;

//TODO: if letter smaller than or equal 90 then it is a capital letters, so we need to increase one in the counter
//TODO: THEN minus the original string length from the counter, else if the difference is bigger than the counter then
//TODO: convert all the letters to small else if, difference smaller than counter convert all letters to capital
//TODO: else difference equal to counter then convert all letters to small.
public class Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

//        making initialization of variables outside the for loop make improvements in time with 42 ms less than initializing
//        inside the loop
        int counter = 0;
        char character;
        int ascii;

        for(int i = 0; i < str.length(); i++){
            character = str.charAt(i);
            ascii = (int) character;
            if(ascii <= 90){
                counter++;
            }
        }
        int diff = str.length() - counter;
        if(diff > counter){
            System.out.println(str.toLowerCase());
        }else if(diff < counter){
            System.out.println(str.toUpperCase());
        }else{
            System.out.println(str.toLowerCase());
        }
    }

}
