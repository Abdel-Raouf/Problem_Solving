package problemSolving.A;

import java.util.Scanner;


public class Inclusion_Exclusion_Recursion {

    private static int inc_exc(int index , int set , int sign){
//        Scanner scanner = new Scanner(System.in);
//        int no_of_elements = scanner.nextInt();
        int no_of_elements = 100;
        int[] primes = new int[]{2,3,5,7};

        if(index == 4){
            if(set == 1){
                return 0;
            }
            return sign * no_of_elements / set;
        }

        return inc_exc(index+1, set, sign) +
                inc_exc(index+1, set * primes[index], sign * -1);

    };

    public static void main(String args[]){
        System.out.print(inc_exc(0, 1, -1));
    }
}
