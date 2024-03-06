package _2058_critical_points;

import _2058_critical_points.Solution.ListNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void leetCodeTest1() {
        ListNode list = new ListNode(3, new ListNode(1));
        int[] result = solution.nodesBetweenCriticalPoints(list);
        assertArrayEquals(new int[]{-1, -1}, result);
    }

    @Test
    void leetCodeTest2() {
        ListNode list = new ListNode(5,
                new ListNode(3,
                        new ListNode(1,
                                new ListNode(2,
                                        new ListNode(5,
                                                new ListNode(1,
                                                        new ListNode(2)))))));
        int[] result = solution.nodesBetweenCriticalPoints(list);
        assertArrayEquals(new int[]{1, 3}, result);
    }

    @Test
    @DisplayName("[2,3,3,2]")
    void leetCodeTest3() {
        ListNode list = new ListNode(2,
                new ListNode(3,
                        new ListNode(3,
                                new ListNode(2))));
        int[] result = solution.nodesBetweenCriticalPoints(list);
        assertArrayEquals(new int[]{-1, -1}, result);
    }

    @Test
    @DisplayName("[2,2,1,3]")
    void leetCodeTest4() {
        ListNode list = new ListNode(2,
                new ListNode(2,
                        new ListNode(1,
                                new ListNode(3))));
        int[] result = solution.nodesBetweenCriticalPoints(list);
        assertArrayEquals(new int[]{-1, -1}, result);
    }

    @Test
    @DisplayName("[6,8,4,1,9,6,6,10,6]")
    void leetCodeTest5() { //1, 3, 4, 7
        ListNode list =
                new ListNode(6,
                        new ListNode(8,
                                new ListNode(4,
                                        new ListNode(1,
                                                new ListNode(9,
                                                        new ListNode(6,
                                                                new ListNode(6,
                                                                        new ListNode(10,
                                                                                new ListNode(6)))))))));
        int[] result = solution.nodesBetweenCriticalPoints(list);
        assertArrayEquals(new int[]{1, 6}, result);
    }

    @Test
    void shouldReturnDefaultForSingleNode() {
        ListNode list = new ListNode(5);
        int[] result = solution.nodesBetweenCriticalPoints(list);
        assertArrayEquals(new int[]{-1, -1}, result);
    }
}
