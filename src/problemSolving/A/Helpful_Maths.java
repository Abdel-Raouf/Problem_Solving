package problemSolving.A;

import java.util.Arrays;
import java.util.Scanner;

public class Helpful_Maths {
// space complexity: O(n.log(n))
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String count = scanner.next();
        String temp = "";
        for(int i = 0; i < count.length(); i++){ // O(n)
            if(!String.valueOf(count.charAt(i)).equals("+")){
                temp += String.valueOf(count.charAt(i));
            }else{
                continue;
            }
        }
        char[] temp_str_to_char = temp.toCharArray();
        Arrays.sort(temp_str_to_char);
        String temp_2 = "";
        for(int x = 0; x < temp_str_to_char.length; x++){ // O(log(n))
            if(x == (temp_str_to_char.length) - 1){
                temp_2 += temp_str_to_char[x];
            }else{
                temp_2 += temp_str_to_char[x];
                temp_2 += "+";
            }
        }

        System.out.println(temp_2);
    }
}
