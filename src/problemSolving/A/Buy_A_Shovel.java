package problemSolving.A;

import java.util.Scanner;

public class Buy_A_Shovel {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int price_of_shovel = scanner.nextInt();
        int change_coin = scanner.nextInt();
        int i = 1;

        while (true){
            if((price_of_shovel * i) % 10 == 0){
                System.out.println(i);
                break;
            }else if((price_of_shovel * i - change_coin) % 10 == 0){
                System.out.println(i);
                break;
            }else{
                i++;
            }
        }
    }
}
