package _66_plus_one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void leetCode1() {
        int[] number = {1, 2, 3};
        int[] result = solution.plusOne(number);
        assertArrayEquals(new int[]{1, 2, 4}, result);
    }

    @Test
    void leetCode2() {
        int[] number = {4, 3, 2, 1};
        int[] result = solution.plusOne(number);
        assertArrayEquals(new int[]{4, 3, 2, 2}, result);
    }

    @Test
    void leetCode3() {
        int[] number = {9};
        int[] result = solution.plusOne(number);
        assertArrayEquals(new int[]{1, 0}, result);
    }

    @Test
    void leetCode4() {
        int[] number = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] result = solution.plusOne(number);
        assertArrayEquals(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 1}, result);
    }

    @Test
    void leetCode5() {
        int[] number = {7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 6};
        int[] result = solution.plusOne(number);
        assertArrayEquals(new int[]{7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 7}, result);
    }
}