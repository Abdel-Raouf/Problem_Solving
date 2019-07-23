package problemSolving.A;

import java.util.Scanner;

public class Way_Too_Long_Words {
// space complexity: O(n)
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int no_of_words = scanner.nextInt();
        String word;

        for(int i = 0; i < no_of_words; ++i){
            word = scanner.next();
            if(word.length() > 10){
                System.out.println(String.valueOf(word.charAt(0)) + String.valueOf(word.length() - 2) + String.valueOf(word.charAt(word.length()-1)));
            }else{
                System.out.println(word);
            }
        }
    }
}
