package roman_to_integer;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class RomanToArabicTest {

    private Solution solution = new Solution();

    @ParameterizedTest
    @ValueSource(strings = {"I", "V", "X", "C", "D", "M"})
    void shouldWorkForSingleValues(String roman) {
        int arabic = solution.romanToInt(roman);
        assertEquals(Solution.Roman.valueOf(roman).value, arabic);
    }

    @Test
    void leetCodeTest1() {
        String roman = "III";
        int arabic = solution.romanToInt(roman);
        assertEquals(arabic, 3);
    }

    @Test
    void leetCodeTest2() {
        String roman = "LVIII";
        int arabic = solution.romanToInt(roman);
        assertEquals(arabic, 58);
    }

    @Test
    void leetCodeTest3() {
        String roman = "MCMXCIV";
        int arabic = solution.romanToInt(roman);
        assertEquals(arabic, 1994);
    }
}