package swap_nodes_in_pairs;

import org.junit.jupiter.api.Test;
import swap_nodes_in_pairs.Solution.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution solution = new Solution();

    @Test
    void leetCodeTest1() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        ListNode result = solution.swapPairs(head);
        assertEquals(2, result.val);
        assertEquals(1, result.next.val);
        assertEquals(4, result.next.next.val);
        assertEquals(3, result.next.next.next.val);
    }

    @Test
    void leetCodeTest2() {
        ListNode head = new ListNode();
        ListNode result = solution.swapPairs(head);
        assertEquals(0, result.val);
        assertNull(result.next);
    }

    @Test
    void leetCodeTest3() {
        ListNode head = new ListNode(1);
        ListNode result = solution.swapPairs(head);
        assertEquals(1, result.val);
        assertNull(result.next);
    }

}
