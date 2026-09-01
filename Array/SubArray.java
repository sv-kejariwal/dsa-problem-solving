// WAP to print sub array of array. Also calculate maximum and minimum sum.
public class SubArray {
    public static void main(String[] args) {
        int[] numbers = { 2, 4, 6, 8, 10, 25, 27, 33 };
        int sum = 0, minimumSum = Integer.MAX_VALUE, maximumSum= Integer.MIN_VALUE;
        System.out.println("Sub Array of given array is: ");
        for (int i=0; i< numbers.length; i++) {
            for (int j=i+1; j<=numbers.length; j++) {
                sum = 0;
                for (int k=i; k<j;k++) {
                    System.out.print(numbers[k]+" ");
                    sum = sum + numbers[k];
                }
                if(sum > maximumSum) {
                    maximumSum = sum;
                }
                if (minimumSum > sum) {
                    minimumSum = sum;
                }
                System.out.print("Sum of this sub-array is: "+sum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Maximum sum is: "+maximumSum);
        System.out.println("Minimum sum is: "+minimumSum);
    }
}
