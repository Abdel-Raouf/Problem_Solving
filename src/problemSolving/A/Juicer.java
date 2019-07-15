package problemSolving.A;

import java.util.Scanner;

public class Juicer {
//    space complexity: log(n) as for loop won't loop on all the n numbers exactly
    public static void main(String Args[]){
        Scanner scanner =  new Scanner(System.in);
        int no_of_orange = scanner.nextInt();
        int size_orange_not_exceed = scanner.nextInt();
        int waste_section_capacity = scanner.nextInt();
        int orange_be_squeezed_in_order;
        int sum_of_orange_in_waste_section = 0;
        int no_of_waste_section_to_be_emptied = 0;

        for(int i = 0; i < no_of_orange; ++i){
            orange_be_squeezed_in_order = scanner.nextInt();
            if(orange_be_squeezed_in_order > size_orange_not_exceed){
                continue; //continue -> jumps immediately to the next iteration of the loop without executing the instructions below it in the loop body
            }else {
                sum_of_orange_in_waste_section += orange_be_squeezed_in_order;
                if(sum_of_orange_in_waste_section > waste_section_capacity){
                    no_of_waste_section_to_be_emptied++;
                    sum_of_orange_in_waste_section = 0;
                }
            }
        }
        System.out.print(no_of_waste_section_to_be_emptied);
    }
}