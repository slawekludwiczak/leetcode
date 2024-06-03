package _55_jump_game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void leetCodeTest1() {
        int[] nums = {2, 3, 1, 1, 4};
        boolean result = solution.canJump(nums);
        assertTrue(result);
    }

    @Test
    void leetCodeTest2() {
        int[] nums = {3, 2, 1, 0, 4};
        boolean result = solution.canJump(nums);
        assertFalse(result);
    }

    @Test
    void leetCodeTest3() {
        int[] nums = {1};
        boolean result = solution.canJump(nums);
        assertTrue(result);
    }

    @Test
    void leetCodeTest4() {
        int[] nums = {2, 0, 0};
        boolean result = solution.canJump(nums);
        assertTrue(result);
    }
}