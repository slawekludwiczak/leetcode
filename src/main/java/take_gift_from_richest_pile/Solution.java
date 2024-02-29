package take_gift_from_richest_pile;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public long pickGifts(int[] gifts, int k) {
        Queue<Integer> giftQueue = new PriorityQueue<>((a, b) -> b - a);
        List<Integer> giftList = Arrays.stream(gifts).boxed().toList();
        giftQueue.addAll(giftList);
        long sum = 0;
        while (k --> 0 && !giftQueue.isEmpty()) {
            Integer nextPile = giftQueue.poll();
            int leftBehind = (int)Math.sqrt(nextPile);
            if (leftBehind == 1) {
                sum += leftBehind;
            } else {
                giftQueue.offer(leftBehind);
            }
        }
        while (!giftQueue.isEmpty()) {
            sum += giftQueue.poll();
        }
        return sum;
    }
}
