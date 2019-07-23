package problemSolving.A;

import java.util.Scanner;

public class Free_Ice_Cream {
// space complexity: O(n)
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int people_in_queue = scanner.nextInt();
        long ice_cream_packs_amount = scanner.nextInt();
        String sign;
        int people;
        int distress_counter = 0;
        for(int i = 0; i < people_in_queue; i++){
            sign = scanner.next();
            people = scanner.nextInt();
            if(sign.equals("+")){
                ice_cream_packs_amount += people;
            }else{
                if((ice_cream_packs_amount - people) >= 0){
                    ice_cream_packs_amount = ice_cream_packs_amount - people;
                }else{
                    distress_counter++;
                }
            }
        }
        System.out.println(ice_cream_packs_amount + " " + distress_counter);
    }
}
