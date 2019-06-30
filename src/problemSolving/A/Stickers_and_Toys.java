package problemSolving.A;

import java.util.Scanner;

public class Stickers_and_Toys {

    public static void main(String args[]) {

        Scanner scan=new Scanner(System.in);
        int queries_no=scan.nextInt();

        for(int x = 0;x < queries_no; x++) {
            int n=scan.nextInt(), s=scan.nextInt(), to=scan.nextInt();
            System.out.println(n-Math.min(s,to)+1); // i learned that when i start coding i must have the solution at hand, not developing a solution
        }// on the computer as paper and pen is the best tool for sketch and solve a problem to think logically and abstractly.
    }
}
