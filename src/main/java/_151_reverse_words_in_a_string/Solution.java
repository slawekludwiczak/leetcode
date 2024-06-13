package _151_reverse_words_in_a_string;

class Solution {
    public String reverseWordsOld(String s) {
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

    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        StringBuilder builder = new StringBuilder();
        int i = chars.length - 1;
        while (chars[i] == ' ') {
            i--;
        }

        for (; i >= 0; ) {
            char next = chars[i];
            if (next == ' ') {
                builder.append(' ');
                while (i >=0 && chars[i] == ' ') {
                    i--;
                }
            } else {
                StringBuilder word = new StringBuilder();
                while (i >= 0 && (next = chars[i]) != ' ') {
                    word.append(next);
                    i--;
                }
                builder.append(word.reverse());
            }
        }
        if (builder.charAt(builder.length() - 1) == ' ') {
            builder.deleteCharAt(builder.length() - 1);
        }
        return builder.toString();
    }
}