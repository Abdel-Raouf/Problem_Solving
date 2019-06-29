package problemSolving.A;

import java.util.Scanner;

public class Is_your_horseshoe_on_the_other_hoof {

    public static void main(String args[]) {
        Scanner scanner =  new Scanner(System.in);
        int[] horseShoeArr = new int[4];
        int similair_horseshoes = 0;

        for(int i = 0; i < 4; i++){
            horseShoeArr[i] = scanner.nextInt();
        }

        for(int x = 0; x < 3; x++){
            for(int k = x+1; k < 4; k++){ //we need to make the second for loop start from within
                if(horseShoeArr[x] == horseShoeArr[k]){ // the first loop finished, as if we assign to it
                    similair_horseshoes++; // a fixed number it will finish and then start from it again
                } // when the higher loop get incremented
            }
        }
        if(similair_horseshoes % 2 == 0 && similair_horseshoes > 2){
            System.out.println(similair_horseshoes / 2);
        }else{
            if(similair_horseshoes > 2){
                System.out.println(similair_horseshoes - 1);
            }else{
                System.out.println(similair_horseshoes);
            }

        }

    }
}
