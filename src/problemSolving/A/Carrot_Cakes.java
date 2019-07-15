package problemSolving.A;

import java.util.Scanner;

public class Carrot_Cakes {
// not solved yet
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int no_of_cakes_needed = scanner.nextInt();
        int time_needed_to_bake_k_cakes = scanner.nextInt();
        int no_of_cakes_backed_simul = scanner.nextInt();
        int time_to_build_sec_oven = scanner.nextInt();

        int oven_one = (no_of_cakes_needed/no_of_cakes_backed_simul) * time_needed_to_bake_k_cakes;
        int oven_two = time_needed_to_bake_k_cakes + time_to_build_sec_oven;
        double time_one_oven_taken =  Math.ceil(no_of_cakes_needed / no_of_cakes_backed_simul) * time_needed_to_bake_k_cakes;
        if(Math.max(oven_one, oven_two) < time_one_oven_taken){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}


// using ceil is wrong from the beginning cuz if we use this example (599 97 54 992) if we make math.ceil(599/54) it will give us 11 and if we make 11 * 54 = 594 which is less than no of cakes needed (599)
//  if we use n+k = 599 + 54 = 653 which is bigger than 599 so it is an accepted value so we need to use ceil+1 or n+k/k