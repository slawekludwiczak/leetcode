package _151_reverse_words_in_a_string;

class Solution {
    public String reverseWords(String s) {
        StringBuilder builder = new StringBuilder();
        String[] split = s.trim().replaceAll("\\s+", " ").split(" ");
        for (int i = split.length - 1; i >= 0; i--) {
            builder.append(split[i]);
            if (i > 0) {
                builder.append(" ");
            }
        }
        return builder.toString();
    }
}