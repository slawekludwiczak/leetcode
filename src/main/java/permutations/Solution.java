package permutations;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        if (nums.length == 1) {
            return List.of(arrayToList(nums));
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                result.add(arrayToList(nums));
                int temp = nums[j - 1];
                nums[j - 1] = nums[j];
                nums[j] = temp;
            }
        }
        return result;
    }

    private static List<Integer> arrayToList(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        return list;
    }
}
