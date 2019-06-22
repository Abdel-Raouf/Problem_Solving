package problemSolving.A;

import java.util.Scanner;

public class BoyOrGirl {

//    TODO: Problem Defination: IF different characters in the string is odd -> (1,3,5) then it is male, otherwise even -> (2, 4, 6) then it is female

//    TODO Note: if we find to alike letters we will count one of them only.

//    TODO solving techniques: we will convert the letters to it's ascii code then using a comparing techniques to compare to find the same letters as to count one and neglect the other one.
//  TODO : WE WILL PUT ALL THE numbers in an array an sort them in desc(greater -> smaller), as if there is two similar characters will be beside each other which will make the sorting more easy.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        String temp = "";

        int counter = 0;

        for (int i = 0; i < str.length(); i++){
            if(!temp.contains(String.valueOf(str.charAt(i)))) {
                temp+=str.charAt(i);
                counter++;
            }else{
                continue;
            }
        }
        if(counter % 2 == 0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }

//another approach i worked on, it's main problem was outofboundexception for array when ii have an odd length
//        int[] sortArray = new int[str.length()];
//
//        for (int i = 0; i < str.length(); i++){
//            char character = str.charAt(i);
//            int ascii = (int) character;
//            sortArray[i] = ascii;
//        }
//
////        it will sort from the smaller to bigger
//        Arrays.sort(sortArray);
//
//        System.out.print(Arrays.toString(sortArray));
//
//        int counter = 0;
//
//
////        manipulation on the sorted array
//
//        for (int j = 0; j < sortArray.length-1; j += 2){
//
//            if (sortArray[j] == sortArray[j + 1]) {
//                counter++;
//            } else if(sortArray[j] != sortArray[j + 1]){
//                counter += 2;
//            }
//
//        }
//
//        int lastElem = sortArray[sortArray.length-1];
//
//        if(sortArray.length % 2 != 0) {
//            if (sortArray[sortArray.length - 3] == sortArray[sortArray.length-2] & sortArray[sortArray.length-2] == sortArray[sortArray.length-1]) {
//                counter++;
//            }else if(sortArray[sortArray.length - 3] == sortArray[sortArray.length-2] & sortArray[sortArray.length-2] != sortArray[sortArray.length-1]){
//                counter++;
//            }
//
//        }
//        System.out.print(counter);


    }


}
