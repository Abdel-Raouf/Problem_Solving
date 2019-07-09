package problemSolving.A;

import java.util.Scanner;

// not solved yet.
public class Heidi_Learns_Hashing_Easy {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int reversible = scanner.nextInt();
        int x = 1;
        int y = 1;

        while((Math.pow(x, 2)+2*x*y+x+1) <= reversible){
            if((Math.pow(x, 2)+2*x*y+x+1) != reversible){
                y++;
            }else {
                if((Math.pow(x, 2)+2*x*y+x+1) == reversible){
                    System.out.println(x + " " + y);
                    break;
                }else{
                    System.out.println("NO");
                    break;
                }
            }
        }


    }
}
