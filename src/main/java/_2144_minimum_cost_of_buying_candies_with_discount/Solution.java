package _2144_minimum_cost_of_buying_candies_with_discount;

import java.util.Arrays;

class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int sum = 0;
        for(int i = cost.length - 1; i >= 0;) {
            int candy1 = cost[i--];
            int candy2 = i >= 0 ? cost[i--] : 0;
            i--;
            sum += (candy1 + candy2);
        }
        return sum;
    }
}