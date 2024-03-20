package _88_merge_sorted_array;

class Solution {

    //best
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, n);
            return;
        }
        if (n == 0) {
            return;
        }
        int mn = m + n;
        int[] stack = new int[mn];
        int i = 0;
        int j = 0;
        int k = 0;
        do {
            if (j == n || nums1[i] < nums2[j] && i < m) {
                stack[k] = nums1[i];
                i++;
            } else {
                stack[k] = nums2[j];
                j++;
            }
            k++;
        } while (k < mn);
        System.arraycopy(stack, 0, nums1, 0, mn);
    }
//
//   better
//   public void merge(int[] nums1, int m, int[] nums2, int n) {
//        if (m == 0) {
//            System.arraycopy(nums2, 0, nums1, 0, n);
//            return;
//        }
//        if (n == 0) {
//            return;
//        }
//        int mn = m + n;
//        List<Integer> ints = new ArrayList<>(mn);
//        int i = 0;
//        int j = 0;
//        while (mn > 0 && i < m && j < n) {
//            if (nums1[i] < nums2[j]) {
//                ints.add(nums1[i]);
//                i++;
//            } else {
//                ints.add(nums2[j]);
//                j++;
//            }
//            mn--;
//        }
//        while (i < m) {
//            ints.add(nums1[i++]);
//        }
//        while (j < n) {
//            ints.add(nums2[j++]);
//        }
//        for (int k = 0; k < nums1.length; k++) {
//            nums1[k] = ints.get(k);
//        }
//    }

//    naive
//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        if (m == 0) {
//            System.arraycopy(nums2, 0, nums1, 0, n);
//            return;
//        }
//        if (n == 0) {
//            return;
//        }
//        System.arraycopy(nums2, 0, nums1, m, n);
//        Arrays.sort(nums1);
//    }
}