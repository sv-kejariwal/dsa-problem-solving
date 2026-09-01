//WAP to reverse Array

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = { 2, 4, 6, 8, 10, 25, 27, 33, 69, 88, 250, 290, 365, 397, 400, 597, 699,999 };
        int temp;
        int start = 0, end = numbers.length-1;
        while (start<end) {
            temp = numbers[end];
            numbers[end] = numbers[start];
            numbers[start] = temp;
            start++;
            end--;            
        }
        System.out.println("Reverse of Array is: ");
        for (int i=0; i<numbers.length;i++) {
            System.out.print(numbers[i]+" ");
        }
    } 
}
