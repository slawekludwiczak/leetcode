package _189_rotate_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void leetCodeTest1() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        solution.rotate(nums, k);
        assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, nums);
    }

    @Test
    void leetCodeTest2() {
        int[] nums = {-1, -100, 3, 99};
        int k = 2;
        solution.rotate(nums, k);
        assertArrayEquals(new int[]{3, 99, -1, -100}, nums);
    }

    @Test
    void customTest1() {
        int[] nums = {1};
        int k = 3;
        solution.rotate(nums, k);
        assertArrayEquals(new int[]{1}, nums);
    }

    @Test
    void customTest2() {
        int[] nums = {1, 2, 3};
        int k = 5;
        solution.rotate(nums, k);
        assertArrayEquals(new int[]{2, 3, 1}, nums);
    }
}