package problemSolving.A;

import java.util.Scanner;

public class Sereja_And_Dima {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int no_of_cards = scanner.nextInt();
        int[] two_pointers_arr = new int[no_of_cards];
        int Sereja = 0;
        int Dima = 0;

        for(int i = 0; i < no_of_cards; i++){
            int cards_in_hand = scanner.nextInt();
            two_pointers_arr[i] = cards_in_hand;
        }

        int start = 0;
        int end = no_of_cards - 1;
        boolean turn_flag = true;
        while(start <= end){

            if(two_pointers_arr[start] >= two_pointers_arr[end]) {

                if(turn_flag){
                    Sereja += two_pointers_arr[start];
                }else{
                    Dima += two_pointers_arr[start];
                }

                start++;
            }else{

                if(turn_flag){
                    Sereja += two_pointers_arr[end];
                }else{
                    Dima += two_pointers_arr[end];
                }

                end--;
            }

            if(turn_flag){
                turn_flag = false;
            }else{
                turn_flag = true;
            }
        }

        System.out.print(Sereja + " " + Dima);
    }
}
