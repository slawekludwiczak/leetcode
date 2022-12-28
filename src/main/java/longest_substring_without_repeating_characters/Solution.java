package longest_substring_without_repeating_characters;

import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<Character> currentStr = new ArrayList<>();
        int longestStr = 0;
        char[] chars = s.toCharArray();
        for (char c : chars) {
            int indexOf;
            if ((indexOf = currentStr.indexOf(c)) != -1) {
                currentStr.subList(0, indexOf + 1).clear();
            }
            currentStr.add(c);
            int currentSize;
            if (longestStr < (currentSize = currentStr.size())) {
                longestStr = currentSize;
            }
        }
        return longestStr;
    }
}
