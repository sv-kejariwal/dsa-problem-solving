
public class PairsInArray {
    public static void main(String[] args) {
        int[] numbers = { 2, 4, 6, 8, 10, 25, 27, 33 };
        for(int i=0; i<numbers.length-1; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                System.out.print("("+numbers[i]+" , "+numbers[j]+" )\t");
            }
            System.out.println();
        }
    }
}
