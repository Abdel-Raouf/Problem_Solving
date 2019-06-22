package problemSolving.A;

import java.util.Scanner;

public class Chunga_Changa {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        long sasha = scanner.nextLong() ;
        long masha = scanner.nextLong();
        long cocnuts_price = scanner.nextLong();
        long exchanged_money = 0;
        long cocnut_sum = (sasha + masha) / cocnuts_price;
        if((sasha % cocnuts_price) + (masha % cocnuts_price) >= cocnuts_price){
            if((sasha % cocnuts_price) > (masha % cocnuts_price)){
                exchanged_money = cocnuts_price - (sasha % cocnuts_price);
            }else{
                exchanged_money = cocnuts_price - (masha % cocnuts_price);
            }
        }

        System.out.println(cocnut_sum + " " +  exchanged_money);
    }
}
