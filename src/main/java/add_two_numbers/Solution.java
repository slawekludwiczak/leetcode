package add_two_numbers;

import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String first = createNumberFromList(l1);
        String second = createNumberFromList(l2);
        BigInteger firstBig = new BigInteger(first);
        BigInteger secondBig = new BigInteger(second);
        BigInteger sum = firstBig.add(secondBig);
        return createReversedList(sum.toString());
    }

    String createNumberFromList(ListNode list) {
        ListNode current = list;
        StringBuilder builder = new StringBuilder();
        builder.append(current.val);
        while (current.next != null) {
            current = current.next;
            builder.append(current.val);
        }
        return builder.reverse().toString();
    }

    ListNode createReversedList(String number) {
        StringBuilder reversedNumber = new StringBuilder(number).reverse();
        ListNode list = null;
        ListNode current = null;
        for (char c : reversedNumber.toString().toCharArray()) {
            int nextVal = c - '0';
            if (list == null) {
                list = new ListNode((int)nextVal);
                current = list;
            } else {
                current.next = new ListNode((int)nextVal);
                current = current.next;
            }
        }
        return list;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
