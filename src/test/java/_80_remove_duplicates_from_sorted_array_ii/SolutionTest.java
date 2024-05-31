package _80_remove_duplicates_from_sorted_array_ii;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void leetCodeTest1() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int result = solution.removeDuplicates(nums);
        int[] trimmedArray = Arrays.copyOf(nums, result);
        assertAll(
                () -> assertEquals(5, result),
                () -> assertArrayEquals(new int[]{1, 1, 2, 2, 3}, trimmedArray)
        );
    }

    @Test
    void leetCodeTest2() {
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        int result = solution.removeDuplicates(nums);
        int[] trimmedArray = Arrays.copyOf(nums, result);
        assertAll(
                () -> assertEquals(7, result),
                () -> assertArrayEquals(new int[]{0, 0, 1, 1, 2, 3, 3}, trimmedArray)
        );
    }

    @Test
    void leetCodeTest3() {
        int[] nums = {1, 1, 1, 1, 2, 2, 3};
        int result = solution.removeDuplicates(nums);
        int[] trimmedArray = Arrays.copyOf(nums, result);
        assertAll(
                () -> assertEquals(5, result),
                () -> assertArrayEquals(new int[]{1, 1, 2, 2, 3}, trimmedArray)
        );
    }

    @Test
    void test3() {
        int[] nums = {1, 1, 1, 2, 2, 3, 3};
        int result = solution.removeDuplicates(nums);
        int[] trimmedArray = Arrays.copyOf(nums, result);
        assertAll(
                () -> assertEquals(6, result),
                () -> assertArrayEquals(new int[]{1, 1, 2, 2, 3, 3}, trimmedArray)
        );
    }
}