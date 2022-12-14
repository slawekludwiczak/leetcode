package merge_two_sorted_lists;

import org.junit.jupiter.api.Test;

import static merge_two_sorted_lists.Solution.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    //list1 = [], list2 = []
    @Test
    void leetCode1() {
        ListNode list1 = null;
        ListNode list2 = null;
        ListNode mergedList = solution.mergeTwoLists(list1, list2);
        assertNull(mergedList);
    }

    //list1 = [1,2,4], list2 = [1,3,4]
    @Test
    void leetCode2() {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));;
        ListNode mergedList = solution.mergeTwoLists(list1, list2);
        assertEquals(1, mergedList.val);
        assertEquals(1, mergedList.next.val);
        assertEquals(2, mergedList.next.next.val);
        assertEquals(3, mergedList.next.next.next.val);
        assertEquals(4, mergedList.next.next.next.next.val);
        assertEquals(4, mergedList.next.next.next.next.next.val);
        assertNull(mergedList.next.next.next.next.next.next);
    }

    //list1 = [], list2 = [0]
    @Test
    void leetCode3() {
        ListNode list1 = null;
        ListNode list2 = new ListNode(0);
        ListNode mergedList = solution.mergeTwoLists(list1, list2);
        assertEquals(0, mergedList.val);
        assertNull(mergedList.next);
    }
}
