public class Fibonacci {

    public static int calculate_fibo(int number, int[] f) {
        if(number ==0 || number ==1 ) {
            return number;
        }

       if(f[number] != 0) {
        return f[number];
       }
       
        f[number] = calculate_fibo(number-1, f) + calculate_fibo(number-2, f);
        return f[number];
    }
    public static void main(String[] args) {
        int number = 8;
        int[] f = new int[number+1];
        System.out.println(f[4]);
        System.out.println(calculate_fibo(number, f));
    }
}