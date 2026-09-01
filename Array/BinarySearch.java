// Binary Search - Prerequisite is Array should be SORTED

public class BinarySearch {

    public static int binarySearch(int[] numbers, int key) {
        int start = 0;
        int end = numbers.length - 1;
        int mid, index = -1;
        while (start <= end) {
            mid = (start + end) / 2;
            if (numbers[mid] == key) { // key ofund
                index = mid;
                break;
            } else if (numbers[mid] > key) { //search in left half
                end = mid - 1;
            } else { //search in right half
                start = mid + 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] numbers = { 2, 4, 6, 8, 10, 25, 27, 33, 69, 88, 250, 290, 365, 397, 400, 597, 699 };
        int key = 2;
       
        int index = binarySearch(numbers, key);
        if (index == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at location "+index);
        }
    }
}
