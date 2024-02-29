package rotate_image;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void leetCodeTest1() {
        int[][] given = {{1,2,3},{4,5,6},{7,8,9}};
        solution.rotate(given);
        int[][] expected = {{7,4,1},{8,5,2},{9,6,3}};
        assertArrayEquals(expected, given);
    }

    @Test
    void leetCodeTest2() {
        int[][] given = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        solution.rotate(given);
        int[][] expected = {{15,13,2,5},{14,3,4,1},{12,6,8,9},{16,7,10,11}};
        assertArrayEquals(expected, given);
    }
}
