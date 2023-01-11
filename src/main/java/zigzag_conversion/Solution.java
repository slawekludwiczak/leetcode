package zigzag_conversion;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public String convert(String s, int numRows) {
        if (s.length() == 1 || numRows == 1) {
            return s;
        }
        List<List<Character>> zigzag = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            zigzag.add(new ArrayList<>());
        }
        char[] chars = s.toCharArray();
        boolean direction = true;
        int row = 0;
        for (char aChar : chars) {
            zigzag.get(row).add(aChar);
            if (direction) {
                row++;
            } else {
                row--;
            }
            if (row == 0) {
                direction = true;
            } else if (row == numRows - 1) {
                direction = false;
            }
        }
        StringBuilder builder = new StringBuilder();
        for (List<Character> zig : zigzag) {
            for (Character aChar : zig) {
                builder.append(aChar);
            }
        }

        return builder.toString();
    }
}
