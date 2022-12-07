package longest_common_prefix;

//https://leetcode.com/problems/longest-common-prefix/description/
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        String prefix = "";
        String shortestStr = findShortestWord(strs);
        int shortestLength = shortestStr.length();
        outer:
        for (int i = 0; i < shortestLength; i++) {
            char nextLetter = shortestStr.charAt(i);
            for (String nextWord : strs) {
                if (nextWord.length() < i || nextLetter != nextWord.charAt(i)) {
                    break outer;
                }
            }
            prefix += nextLetter;
        }
        return prefix;
    }

    private String findShortestWord(String[] strs) {
        String shortest = strs[0];
        if (strs.length == 1)  {
            return shortest;
        }
        for (int i = 1; i < strs.length; i++) {
            if (shortest.length() > strs[i].length()) {
                shortest = strs[i];
            }
        }
        return shortest;
    }
}
