package longest_common_prefix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void shouldReturnElementForArrayWithSingleElement() {
        String[] strs = {"something"};
        String prefix = solution.longestCommonPrefix(strs);
        assertEquals("something", prefix);
    }

    @Test
    public void shouldReturnEmptyStringForArrayWithEmptyString() {
        String[] strs = {""};
        String prefix = solution.longestCommonPrefix(strs);
        assertEquals("", prefix);
    }

    @Test
    public void leetCodeTest1() {
        String[] strs = {"flower", "flow", "flight"};
        String prefix = solution.longestCommonPrefix(strs);
        assertEquals("fl", prefix);
    }

    @Test
    public void leetCodeTest2() {
        String[] strs = {"dog", "racecar", "car"};
        String prefix = solution.longestCommonPrefix(strs);
        assertEquals("", prefix);
    }

    @Test
    public void leetCodeTest3() {
        String[] strs = {"ab", "a"};
        String prefix = solution.longestCommonPrefix(strs);
        assertEquals("a", prefix);
    }
}
