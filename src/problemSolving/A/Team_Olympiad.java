package problemSolving.A;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Team_Olympiad {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int no_of_teams = scanner.nextInt ();
        int[] skilled_children = new int[no_of_teams];
        for(int i = 0; i<skilled_children.length;i++)
            skilled_children[i] = scanner.nextInt ();

        int one = 0, two = 0, three = 0;
        List<Integer> ones = new ArrayList<> ();
        List<Integer> twos = new ArrayList<> ();
        List<Integer> threes = new ArrayList<> ();
        int index  = 1;
        for(int num : skilled_children) {
            if(num == 1) {
                ones.add (index);
                one++;
            }
            if(num == 2) {
                twos.add (index);
                two++;
            }
            if(num == 3) {
                threes.add (index);
                three++;
            }
            index++;
        }

        int count = Math.min (one, Math.min (two, three)); //the minumun numbers of ones, twos or thress will be the max number of teams to be formed
        System.out.println (count);
        for(int i=0; i < count;i++) {
//            we will remove first index (zero-based) due to we started with index of one.
            System.out.println (""+ones.remove (0) + " "+ twos.remove (0)+" "+ threes.remove (0));
        }
    }
}

