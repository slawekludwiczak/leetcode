package add_two_numbers;

import org.junit.jupiter.api.Test;

import static add_two_numbers.Solution.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void shouldCreateNumberFromList() {
        ListNode list = new ListNode(
                2, new ListNode(
                        4, new ListNode(
                                3
        )));
        String number = solution.createNumberFromList(list);
        assertEquals("342", number);
    }

    @Test
    void shouldCreateNumberFor0() {
        ListNode list = new ListNode(0);
        String number = solution.createNumberFromList(list);
        assertEquals("0", number);
    }

    @Test
    void shouldCreateReversedListFromNumber() {
        String number = "807";
        ListNode list = solution.createReversedList(number);
        assertEquals(7, list.val);
        assertEquals(0, list.next.val);
        assertEquals(8, list.next.next.val);
        assertNull(list.next.next.next);
    }
    @Test
    void leetCode1(){
        ListNode l1 = new ListNode(
                2, new ListNode(
                    4, new ListNode(
                        3
        )));
        ListNode l2 = new ListNode(
                5, new ListNode(
                    6, new ListNode(
                        4
        )));
        ListNode result = solution.addTwoNumbers(l1, l2);
        assertEquals(7, result.val);
        assertEquals(0, result.next.val);
        assertEquals(8, result.next.next.val);
    }

    @Test
    void leetCode2(){
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        ListNode result = solution.addTwoNumbers(l1, l2);
        assertEquals(0, result.val);
    }

    @Test
    void leetCode3(){
        ListNode l1 = new ListNode(
                9, new ListNode(
                    9, new ListNode(
                        9, new ListNode(
                            9, new ListNode(
                                9, new ListNode(
                                    9, new ListNode(
                                       9)))))));
        ListNode l2 = new ListNode(
                9, new ListNode(
                    9, new ListNode(
                        9, new ListNode(
                            9, new ListNode()))));
        ListNode result = solution.addTwoNumbers(l1, l2);
        assertEquals(8, result.val);
        assertEquals(9, result.next.val);
        assertEquals(9, result.next.next.val);
        assertEquals(9, result.next.next.next.val);
        assertEquals(0, result.next.next.next.next.val);
        assertEquals(0, result.next.next.next.next.next.val);
        assertEquals(0, result.next.next.next.next.next.next.val);
        assertEquals(1, result.next.next.next.next.next.next.next.val);
    }

    @Test
    void leetCode4(){
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(
                1, new ListNode(
                    9, new ListNode(
                        9, new ListNode(
                            9, new ListNode(
                                9, new ListNode(
                                    9, new ListNode(
                                        9, new ListNode(
                                            9, new ListNode(
                                                9, new ListNode(
                                                    9))))))))));
        ListNode result = solution.addTwoNumbers(l1, l2);
//        assertEquals(8, result.val);
//        assertEquals(9, result.next.val);
//        assertEquals(9, result.next.next.val);
//        assertEquals(9, result.next.next.next.val);
//        assertEquals(0, result.next.next.next.next.val);
//        assertEquals(0, result.next.next.next.next.next.val);
//        assertEquals(0, result.next.next.next.next.next.next.val);
//        assertEquals(1, result.next.next.next.next.next.next.next.val);
    }
}
