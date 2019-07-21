package problemSolving.A;

import java.util.Scanner;

public class Carrot_Cakes {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int no_of_cakes_needed = scanner.nextInt();
        int time_needed_to_bake_k_cakes = scanner.nextInt();
        int no_of_cakes_backed_simul = scanner.nextInt();
        int time_to_build_sec_oven = scanner.nextInt();

        int no_of_times_oven_used = (no_of_cakes_needed + no_of_cakes_backed_simul - 1) / no_of_cakes_backed_simul; //Ceil implemented manually

        int oven_1 = 0, oven_2 = time_to_build_sec_oven;

        for(int i = 0; i < no_of_times_oven_used; i++){
            if(oven_1 <= oven_2){
                oven_1 += time_needed_to_bake_k_cakes;
            }else {
                oven_2 += time_needed_to_bake_k_cakes;
            }
        }

        int time_needed_to_use_one_oven = no_of_times_oven_used * time_needed_to_bake_k_cakes;
// if time needed to use one oven bigger than the max of the two ovens then we need another oven
        if(Math.max(oven_1,oven_2) < time_needed_to_use_one_oven){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }


    }
}