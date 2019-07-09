package problemSolving.A;

import java.util.Scanner;

public class Die_Roll {

//    space complexity -> O(1) as i have a fixed number which is 6 that's the problem depend on it.
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int yakko = scanner.nextInt();
        int wakko = scanner.nextInt();

        int Dot_TravelPlace_pos = Math.abs(Math.max(yakko, wakko) - 6) + 1;

        if(Dot_TravelPlace_pos == 3){
            System.out.println(1 + "/" + 2);
        }else if(Dot_TravelPlace_pos == 6){
            System.out.println(1 + "/" + 1);
        }else if(Dot_TravelPlace_pos % 2 == 0){
            System.out.println((Dot_TravelPlace_pos / 2) + "/" + (6 / 2));
        }else{
            System.out.println(Dot_TravelPlace_pos + "/" + 6);
        }
    }
}



//        int possibility_in_dec = Dot_TravelPlace_pos / 6; // to get decimal representation when making devision we need to make anyone
// of the two numbers decimal as 6 -> 6.0 to make java use Math.float not Math.integer.
//        double final_porbablility = new DecimalFormat("#.#").format(possibility_in_dec);
//        String.format("%.2f", possibility_in_dec)

//        to get percision i want from a decimal number
//        possibility_in_dec = Double.parseDouble(new DecimalFormat("#.#").format(possibility_in_dec));
//        convertingt_dec_to_frac(possibility_in_dec)


//    //    using bit integers library but it's not efficient in long run or on a big range of values
//    private static int gcdThing(int a, int b) {
//        BigInteger b1 = BigInteger.valueOf(a); // we need to revise BigInteger.
//        BigInteger b2 = BigInteger.valueOf(b);
//        BigInteger gcd = b1.gcd(b2);
//        return gcd.intValue();
//    }
//
//    //    Euclid’s algorithm to get the "Greatest Common Divisor" of two integers.
//    public static int gcd(int num1, int num2) { // read about it.
//        int max = Math.abs(num1);
//        int min = Math.abs(num2);
//
//        while (max > 0) {
//            if (max < min) {
//                int x = max;
//                max = min;
//                min = x;
//            }
//            max %= min;
//        }
//
//        return min;
//    }
//
//    public static String convertingt_dec_to_frac(double pro_in_decimal){ // read about what a static function means.
//
//        String s = String.valueOf(pro_in_decimal);
//        int digits_before_point = s.length() - 1 - s.indexOf(".");
//        //continue solution with this link on stackoverflow(accepted answer): https://stackoverflow.com/questions/31585931/how-to-convert-decimal-to-fractions
//        int denom = 1;
//        for(int i = 0; i < digits_before_point; i++){
//            pro_in_decimal *= 10;
//            denom *= 10;
//        }
//
//        int num = (int) Math.round(pro_in_decimal);
//
//        int g =  gcdThing(num, denom);
//        int num_final = num / g;
//        int denom_final = denom / g;
////        we need to simplify the number more to match the judge as 5/6
//        return String.valueOf(num_final + 1) + "/" + String.valueOf(denom_final + 1); //change return before getting out of the function.
//    }
