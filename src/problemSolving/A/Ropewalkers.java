package problemSolving.A;

import java.util.Scanner;
// not solved yet.
public class Ropewalkers {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Integer first_walker = scanner.nextInt();
        Integer sec_walker = scanner.nextInt();
        Integer third_walker = scanner.nextInt();
        Integer distance = scanner.nextInt();
        int[] arr = new int[4];

        for(int i = 0; i < 4; i++) {
            arr[i] = scanner.nextInt();
        }
        int counter = 0;

        for(int x = 0; x < 4; x++){
            if(arr[2] <  arr[3]){
                arr[2] += arr[3] - arr[2];
            }else {
                if(x == 2){
                    if(Math.abs(arr[x] - arr[x+1]) >= arr[3]){
                        counter += 0;
                    }else {
                        counter += Math.abs(Math.abs(arr[x] - arr[x+1]) - arr[3]);
                    }
                }
            }
        }

//        if(third_walker < distance) {
//            int var = distance - third_walker;
//            third_walker += var;
//        }else{
//
//            if(Math.abs(first_walker - sec_walker) > distance){
//                counter += 0;
//            }else if(Math.abs(sec_walker - third_walker) > distance){
//                counter += 0;
//            }else if(Math.abs(third_walker - first_walker) > distance){
//                counter += 0;
//            } else{
//                int first_dis = Math.abs(Math.abs(first_walker - sec_walker) - distance);
//                int sec_dis = Math.abs(Math.abs(sec_walker - third_walker) - distance);
//                int third_dis = Math.abs(Math.abs(third_walker - first_walker) - distance);
//
//                counter = first_dis + sec_dis + third_dis;
//
//            }
//
//        }

        System.out.println(counter);
    }
}
