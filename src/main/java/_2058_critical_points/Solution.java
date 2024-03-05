package _2058_critical_points;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if (head.next == null || head.next.next == null) {
            return new int[]{-1, -1};
        }
        ArrayList<Integer> criticalIndices = new ArrayList<>();
        ListNode curr = head.next;
        ListNode prev = head;
        int index = 1;
        while (curr.next != null) {
            if (curr.val < prev.val && curr.val < curr.next.val ||
                    curr.val > prev.val && curr.val > curr.next.val) {
                criticalIndices.add(index);
            }
            index++;
            prev = curr;
            curr = curr.next;
        }
        int minDistance;
        int maxDistance;
        if (criticalIndices.size() < 2) {
            minDistance = -1;
            maxDistance = -1;
        } else {
            minDistance = minDistance(criticalIndices);
            maxDistance = criticalIndices.getLast() - criticalIndices.getFirst();
        }
        return new int[]{minDistance, maxDistance};
    }

    int minDistance(List<Integer> indices) {
        int minDistance = indices.get(1) - indices.get(0);
        for (int i = 0; i < indices.size() - 1; i++) {
            int min = indices.get(i + 1) - indices.get(i);
            if (min < minDistance) {
                minDistance = min;
            }
        }
        return minDistance;
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
