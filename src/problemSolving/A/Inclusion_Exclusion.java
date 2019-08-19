package problemSolving.A;

import java.util.Scanner;

public class Inclusion_Exclusion {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int no_of_elements = scanner.nextInt();

        int counter = 0;
// As we know that 2,3,5,7 is 4 numbers so we need 4 loops to try every combination of them
// 2^4 - 1 = 15 .... 4 is the number of elements to get the number of subsets, so using product_rule(2*2*2*2 = 16 - 1 = 15) the one we subtract refers to (0,0,0,0)
        for(int i2 = 0; i2 < 2; ++i2){
            for (int i3 = 0; i3 < 2; ++i3){
                for (int i5 = 0; i5 < 2; ++i5){
                    for (int i7 = 0; i7 < 2; ++i7){ // every time we enter a loop iteration elements_counter will re-intialize to zero again
                        int set = 1, elements_counter = 0;

                        if(i2 > 0){
                            set *=2;
                            ++elements_counter; //this counter sees the length of the sets as to know length of the set is even or odd;
                        }
                        if(i3 > 0){
                            set *=3;
                            ++elements_counter;
                        }
                        if(i5 > 0){
                            set *=5;
                            ++elements_counter;
                        }
                        if(i7 > 0){
                            set *=7;
                            ++elements_counter;
                        }
                        if(elements_counter == 0){
                            continue; // if set is all zeros, move to the next iteration of the loop
                        }
// if length of the set is even subtract it cuz it is a duplicate(refer to venn diagram), else it is odd add it cuz it is the single numbers and the whole intersection between them.
                        int sign = elements_counter % 2 == 0 ? -1 : 1;
// here we try to subtract the numbers that are divisible on two numbers as ( 100 / (2*3) = 100 / 6 = 16) which we included with us
// when we try (100 / 2 = 50) and (100 / 3 = 33) so we need to make (50+33-16 = 67) using the sign
                        counter += sign * no_of_elements / set;

                    }
                }
            }
        }
        System.out.println(counter);
    }
}
