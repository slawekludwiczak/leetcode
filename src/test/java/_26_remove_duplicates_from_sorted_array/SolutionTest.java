package _26_remove_duplicates_from_sorted_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void leetCodeTest1() {
        int[] array = {1, 1, 2};
        int k = solution.removeDuplicates(array);
        assertAll(
                () -> assertArrayEquals(new int[]{1, 2, 0}, array),
                () -> assertEquals(2, k)
        );
    }

    @Test
    void leetCodeTest2() {
        int[] array = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = solution.removeDuplicates(array);
        assertAll(
                () -> assertArrayEquals(new int[]{0, 1, 2, 3, 4, 0, 0, 0, 0, 0}, array),
                () -> assertEquals(5, k)
        );
    }
}