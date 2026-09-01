// WAP to find largest number in an integer array

import java.util.*;

public class Largest {

    public static void largestInArray(int[] num) {
        int largest = Integer.MIN_VALUE;
        int index = 0;
        for (int i=0; i<num.length; i++) {
            if (largest < num[i]) {
                largest = num[i];
                index = i;
            }
        }
        System.out.println("Largest element is "+largest+" at location "+index);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int arraySize = sc.nextInt();
        System.out.println("Enter elements");
        int[] numbers = new int[arraySize];
        for (int i=0; i<arraySize; i++) {
            numbers[i] = sc.nextInt();
        }

        largestInArray(numbers);
    } 
}
