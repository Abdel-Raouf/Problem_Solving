package problemSolving.A;

import java.util.Scanner;

public class Magnets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no_of_magnets = scanner.nextInt();

        int magnets, temp=0, counter=0;
        for(int i = 0; i < no_of_magnets; i++){
            magnets = scanner.nextInt();

            if(magnets != temp){
                counter++;
            }
            temp = magnets;
        }

        System.out.println(counter);
    }
}
