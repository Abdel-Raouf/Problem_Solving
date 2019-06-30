package problemSolving.A;

import java.util.Scanner;

public class Colorful_Stones_Simplified_Edition {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        char[] s_where_liss_stand = scanner.next().toCharArray();
        char[] t_instrcutions = scanner.next().toCharArray();
        int liss_real_position = 1;
        int liss_pos_in_arr = 0;

        for(int i = 0; i < t_instrcutions.length; i++){
            while(s_where_liss_stand[liss_pos_in_arr] == t_instrcutions[i]){
                    liss_real_position++;
                    liss_pos_in_arr++;
                    break; // break will make the while skip checking on itself again, and make it go to the higher level for loop directly.
            }
        }

        System.out.println(liss_real_position);
    }
}

