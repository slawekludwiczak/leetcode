package remove_element;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void leetCodeTest1() {
        int[] array = {3, 2, 2, 3};
        int val = 3;
        int k = solution.removeElement(array, val);
        assertEquals(2, k);
        assertArrayEquals(new int[]{2, 2, 0, 0}, array);
    }

    @Test
    void leetCodeTest2() {
        int[] array = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int k = solution.removeElement(array, val);
        int[] sortedResult = Arrays.copyOf(array, 5);
        Arrays.sort(sortedResult);
        assertEquals(5, k);
        assertArrayEquals(new int[]{0, 0, 1, 3, 4}, sortedResult);
    }
}
