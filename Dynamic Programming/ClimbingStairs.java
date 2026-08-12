public class ClimbingStairs {
    public static int calculateNumberOfWaysToClimbStairs(int stairs) {
        if (stairs == 0 || stairs == 1) {
            return 1;
        }

        return calculateNumberOfWaysToClimbStairs(stairs-1) + calculateNumberOfWaysToClimbStairs(stairs - 2);
    }

      public static int optimisedWay(int stairs, int[] dp) {
        if (stairs == 0 || stairs == 1) {
            return 1;
        }

        if(dp[stairs] != 0) {
            return dp[stairs];
        }

        dp[stairs] = optimisedWay(stairs-1, dp) + optimisedWay(stairs - 2, dp);
        return dp[stairs];
    }
    public static void main(String[] args) {
        int stairs = 3;
        int[] dp = new int[stairs+1];
        dp[0] = dp[1] = 0;
        System.out.println(calculateNumberOfWaysToClimbStairs(stairs));
        System.out.println(optimisedWay(stairs, dp));
    }
}
