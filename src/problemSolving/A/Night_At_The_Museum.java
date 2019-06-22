package problemSolving.A;

import java.util.Scanner;

public class Night_At_The_Museum {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        char[] exhibit = scanner.next().toCharArray();
        char start_of_rotation = 'a';
        Integer ascii = 0, start_ascii = (int) start_of_rotation,
                clock_rotations = 0, compare_to_letter_no, diff_only;

        for(int i = 0; i < exhibit.length; i++){
            ascii = (int) exhibit[i];
            if(start_ascii == ascii){
                clock_rotations += 0;
            }else{
                compare_to_letter_no = Math.abs(Math.abs(start_ascii - ascii) - 26);
                diff_only = Math.abs(start_ascii - ascii);
                clock_rotations += Math.min(compare_to_letter_no, diff_only);
                start_ascii = ascii;
            }
        }

        System.out.println(clock_rotations);
    }
}
