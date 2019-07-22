package problemSolving.A;

import java.util.Scanner;

public class Anton_and_Letters {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String str = null;
        String temp = "";
        int counter = 0;
        for(int i = 0; i <= 1000; i++){
            str = scanner.next();

           if(str.substring(0,2).equals("{}")){
            break;
           }else if(str.contains("{") && str.contains(String.valueOf(str.charAt(1))) && str.contains("}")){
             counter++;
             break;
           } else{
               if(str.substring(1).equals("}")){
                   if (!temp.contains(String.valueOf(str.charAt(0)))) {
                       temp+=str.charAt(0);
                       counter++;
                   }
                   break;
               }else{
                   if(i == 0){
                       temp+=str.charAt(1);
                       counter++;
                   }else{
                       if (!temp.contains(String.valueOf(str.charAt(0)))) {
                           temp+=str.charAt(0);
                           counter++;
                       }
                   }
               }
           }
        }

        System.out.println(counter);
    }
}
