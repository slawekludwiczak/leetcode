package take_gift_from_richest_pile;

class SolutionBest {
    public long pickGifts(int[] gifts, int k) {
        for (int i = 0; i < k; i++) {
            int pileIndex = findBiggestPile(gifts);
            if (pileIndex == -1) {
                break;
            }
            int leftBehind = (int)Math.sqrt(gifts[pileIndex]);
            gifts[pileIndex] = leftBehind;
        }
        long sum = 0;
        for (int gift : gifts) {
            sum = sum + gift;
        }
        return sum;
    }

    private int findBiggestPile(int[] gifts) {
        int index = 0;
        int max = gifts[index];
        for (int i = 0; i < gifts.length; i++) {
            if (max < gifts[i]) {
                index = i;
                max = gifts[index];
            }
        }
        return index;
    }
}
