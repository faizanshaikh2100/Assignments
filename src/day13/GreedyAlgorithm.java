package day13;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GreedyAlgorithm {

    public static int[] greedyCoinChange(int amount, int[] coins) {
        Arrays.sort(coins);  // Sort the coins in ascending order

        int numCoins = 0;
        List<Integer> change = new ArrayList<>();

        for (int i = coins.length - 1; i >= 0; i--) {
            while (amount >= coins[i]) {
                amount -= coins[i];
                numCoins++;
                change.add(coins[i]);
            }
        }

        int[] result = new int[change.size()];
        for (int i = 0; i < change.size(); i++) {
            result[i] = change.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int amount = 67;
        int[] coins = {25, 10, 5, 1};

        int[] change = greedyCoinChange(amount, coins);

        System.out.println("Minimum number of coins needed: " + change.length);
        System.out.println("Change: " + Arrays.toString(change));
    }
}
