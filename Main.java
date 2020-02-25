// find minimum number in  an array
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    //class fields
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter c0unt: ");
        int count = sc.nextInt();
        sc.nextLine();

        int[]array = readIntegers(count);
        System.out.println(Arrays.toString(array));
        int result = findMinNumber(array);
        System.out.println(result + " is the minimum value in the array");


    }

    // get the numbers from the user and store them in the array
    private static int[] readIntegers(int count){
        // create a new array with the size of the numbers that user will enter
        int[] array = new int[count];

        //populate the array with the user numbers
        for(int i = 0; i < array.length; i++){
            System.out.println("Enter a number: ");
            int number = sc.nextInt();
            sc.nextLine();
            array[i] = number;
        }
        return array;
    }

    private static int findMinNumber(int[] array){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++)
        {
            // retrieve the value at position i
            int value = array[i];
            //compare each value to i with each iteration
            if(value < min){
                min = value;
            }
        }

        return min;
    }

}
