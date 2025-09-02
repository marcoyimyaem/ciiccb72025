package chapter3;
import java.util.*;
public class ArrayLesson {
    public static void main(String...  args  ) {
        int [] i = new int[3];
        int[] numbers2 = new int[]{1,54,75}; 
        int[] numbers3 = {1,54,75};
        Student[] batch2 = {new Student(),new Student(),new Student(),new Student(),null};
        for(int j = 0; j<numbers3.length;j++)
            System.out.println(numbers3[j]);
        int[] numbers4 = {1,54,75,5,76,34,7,3,8,10,34};
        Arrays.sort(numbers4);
        for(int number4: numbers4)
            System.out.print(number4+", ");
        int searchNum = 9;
        System.out.println("\n"+searchNum+" search result: "+ Arrays.binarySearch(numbers4, searchNum));
        String[] numbersString = {"1","a","54","75","5","76","34","7","3","8","10","34"};
        String stringSearch = "A";
        Arrays.sort(numbersString);
        for(String numberString: numbersString)
            System.out.print(numberString+", ");
        System.out.println("\n"+stringSearch+" search result: "+ Arrays.binarySearch(numbersString, stringSearch));
        byte[][] diffsize = { {1,2}, //[0]
                                {3}, //[1]
                                {9,8,7} //[2]
                            };
        System.out.println(diffsize[2][2]);
        for(byte a=0;a<diffsize.length;a++){
            for(byte b=0;b<diffsize[a].length;b++){
                System.out.print(diffsize[a][b]+",");
            }
            System.out.println();
        }
}//  1  2  3 4 5 6
 //  0  1  2 3 4 5
 //-1 -2 -3
}

class Student{
    String fullname;
    int age;
    String address;
    String course;
    int yearLevel;
}