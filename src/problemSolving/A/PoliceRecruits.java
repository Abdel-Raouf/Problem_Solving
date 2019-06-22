package problemSolving.A;

import java.util.Scanner;

public class PoliceRecruits {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        int no_of_crimes_and_officers = scanner.nextInt();
        int crimes_officers;

        Integer officers_counter = 0;
        Integer crime_counter = 0;

        for(int i = 0; i < no_of_crimes_and_officers; i++){
            crimes_officers = scanner.nextInt();
            if(crimes_officers >= 1){
                officers_counter += crimes_officers;
            }else{
                if(officers_counter > 0){
                    officers_counter--;
                }else{
                    crime_counter += 1;
                }
            }
        }

        System.out.println(crime_counter);
    }
}




//        int crimes_counter = 0;
//        int officers_counter = 0;
//        int reserved_officers = 0;
//        for(int x = 0; x < no_of_crimes_and_officers; x++){
//            if(crimes_officers_arr.get(x) != -1){
//                officers_counter = crimes_officers_arr.get(x);
//                for(int j = x-1; j >= 0; j--){
//                    crimes_counter += Math.abs(crimes_officers_arr.get(j));
////                    crimes_officers_arr.remove(j); // see this in debuging as shrinking the array list may make the first layer loop fool after that.
//                }
//                if(crimes_counter - officers_counter < 0){
//                    reserved_officers += Math.abs(crimes_counter - officers_counter); // we need to know how we will benefit form the reserved officers.
//                }else if(crimes_counter - officers_counter == 0){
//                    crimes_counter = 0;
//                }else {
//                    crimes_counter += crimes_counter - officers_counter;
//                }
//            }
//
//        }
//
//        if(crimes_counter - reserved_officers <= 0){
//            crimes_counter = 0;
//            System.out.println(crimes_counter);
//        }else{
//            crimes_counter = crimes_counter - reserved_officers;
//            System.out.println(crimes_counter);
//        }
