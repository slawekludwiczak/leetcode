package merge_two_sorted_lists;

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
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode result = null;
        ListNode lastNode = null;
        while (list1 != null && list2 != null) {
            ListNode node;
            if (list1.val < list2.val) {
                node = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                node = new ListNode(list2.val);
                list2 = list2.next;
            }
            if (result == null) {
                result = node;
                lastNode = result;
            } else {
                lastNode.next = node;
                lastNode = lastNode.next;
            }
        }
        if (list1 != null) {
            lastNode.next = list1;
        }
        if (list2 != null) {
            lastNode.next = list2;
        }
        return result;
    }
    static class ListNode {
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


