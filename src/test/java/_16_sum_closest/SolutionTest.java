package _16_sum_closest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 3 <= nums.length <= 500
 * -1000 <= nums[i] <= 1000
 * -104 <= target <= 104
 */
class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void leetCodeTest1() {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        int result = solution.threeSumClosest(nums, target);
        assertEquals(2, result);
    }

    @Test
    void leetCodeTest2() {
        int[] nums = {0, 0, 0};
        int target = 1;
        int result = solution.threeSumClosest(nums, target);
        assertEquals(0, result);
    }

    @Test
    void leetCodeTest3() {
        int[] nums = {1, 1, 1, 0};
        int target = -100;
        int result = solution.threeSumClosest(nums, target);
        assertEquals(2, result);
    }
}