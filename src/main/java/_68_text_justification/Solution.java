package _68_text_justification;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        if (words.length < 1 || words.length > 300) {
            throw new IllegalArgumentException();
        }
        if (maxWidth < 1 || maxWidth > 100) {
            throw new IllegalArgumentException();
        }

        List<String> lines = createLines(words, maxWidth);
        return lines;
    }

    private List<String> createLines(String[] words, int maxWidth) {
        List<String> lines = new ArrayList<>();

        StringBuilder lineBuilder = new StringBuilder();
        for (int i = 0; i < words.length;) {
            String word = words[i];
            if (lineBuilder.isEmpty()) {
                lineBuilder.append(word);
                i++;
            } else if (lineBuilder.length() + word.length() + 1 <= maxWidth) {
                lineBuilder.append(' ').append(word);
                i++;
            } else {
                String justified = justify(lineBuilder.toString(), maxWidth, false);
                lines.add(justified);
                lineBuilder.setLength(0);
            }
        }
        if (!lineBuilder.isEmpty()) {
            String justified = justify(lineBuilder.toString(), maxWidth, true);
            lines.add(justified);
        }
        return lines;
    }

    String justify(String line, int maxWidth, boolean leftPadded) {
        String[] words = line.split(" ");
        int gaps = words.length - 1;
        StringBuilder justified = new StringBuilder();
        if (gaps == 0) {
            justified.append(words[0]);
            justified.append(" ".repeat(maxWidth - justified.length()));
        } else {
            int nonWhitespaceCharacters = line.replaceAll("\\s", "").length();
            int standardGap = (maxWidth - nonWhitespaceCharacters) / gaps;
            int extraGap = (maxWidth - nonWhitespaceCharacters) % gaps;
            if (leftPadded) {
                return line + " ".repeat(maxWidth - line.length());
            }
            for (String word : words) {
                justified.append(word);
                if (gaps > 0) {
                    justified.append(" ".repeat(standardGap));
                    if (extraGap > 0) {
                        justified.append(" ");
                        extraGap--;
                    }
                    gaps--;
                }
            }
        }
        return justified.toString();
    }
}