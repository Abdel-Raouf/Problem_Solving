package problemSolving.A;

import java.util.Scanner;

public class Alex_And_A_Rhombus {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int rhombus_no = scanner.nextInt();
        int increment_by_four = 8;
        int last_rhombus_no = 5;
        int rhombus_cells_no = 0;

        if(rhombus_no < 2){
            System.out.println(1);
        }else {
            if(rhombus_no == 2){
                System.out.println(5);
            }else{
                for(int i = 0; i < rhombus_no - 2; i++){
                    rhombus_cells_no = last_rhombus_no + increment_by_four;
                    last_rhombus_no = rhombus_cells_no;
                    increment_by_four += 4;
                }
                System.out.println(rhombus_cells_no);
            }
        }
    }
}
