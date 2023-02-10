package take_gift_from_richest_pile;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void leetCodeTest1() {
        int[] gifts = {25,64,9,4,100};
        int k = 4;
        assertEquals(29, solution.pickGifts(gifts, k));
    }

    @Test
    void leetCodeTest2() {
        int[] gifts = {1, 1, 1, 1};
        int k = 4;
        assertEquals(4, solution.pickGifts(gifts, k));
    }
}
