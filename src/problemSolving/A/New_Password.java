package problemSolving.A;

import java.util.Scanner;

public class New_Password {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int pass_length = scanner.nextInt();
        int distinct_symbols_no = scanner.nextInt();
        int counter = 0;
        char temp = 'a';

        for(int i = 0; i < pass_length ; ++i){
            System.out.print(temp+"");
            temp += 1;
            counter++;
            if(counter == distinct_symbols_no){
                counter = 0;
                temp = 'a';
            }
        }
    }
}



//((char) (random.nextInt(alphabet.length()) + 97) converting from integer to letters while using random