package problemSolving.A;

import java.util.Scanner;

public class WordCapitalization {

  public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      String str = scanner.next();

      char character = str.charAt(0);
      int ascii = (int) character;

      if(ascii <= 90){
        System.out.println(str);
      }else{
          System.out.println(str.substring(0, 1).toUpperCase() + str.substring(1));
      }

  }

//  char []strCharArray = str.toCharArray(); to convert a string to an array if characters.
//          Character.toUpperCase(strCharArray[0]); to check if the first character id true or false
//  str.substring(0,1) will get the first letter of the string as a string.
//    str.charAt(0) will get the first letter of the string as a char.
}
