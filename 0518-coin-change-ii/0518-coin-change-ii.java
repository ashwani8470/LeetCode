
import java.util.Arrays;

class Solution {
    public int change(int amount, int[] coins) {

        int n = coins.length;
        int[][] dp = new int[n][amount + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(n - 1, amount, coins, dp);
    }

    public int solve(int index, int amount, int[] coins, int[][] dp) {

        if (amount == 0) {
            return 1;
        }

        if (index < 0) {
            return 0;
        }

        if (dp[index][amount] != -1) {
            return dp[index][amount];
        }

        // Not Take
        int notTake = solve(index - 1, amount, coins, dp);

        // Take
        int take = 0;

        if (coins[index] <= amount) {
            take = solve(index, amount - coins[index], coins, dp);
        }

        return dp[index][amount] = take + notTake;
    }
}
