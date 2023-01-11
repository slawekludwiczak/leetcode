package zigzag_conversion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void leetCodeTest1() {
        String text = "PAYPALISHIRING";
        int rows = 3;
        String result = solution.convert(text, rows);
        assertEquals("PAHNAPLSIIGYIR", result);
    }

    @Test
    void leetCodeTest2() {
        String text = "PAYPALISHIRING";
        int rows = 4;
        String result = solution.convert(text, rows);
        assertEquals("PINALSIGYAHRPI", result);
    }

    @Test
    void leetCodeTest3() {
        String text = "A";
        int rows = 1;
        String result = solution.convert(text, rows);
        assertEquals("A", result);
    }

    @Test
    void leetCodeTest4() {
        String text = "AB";
        int rows = 1;
        String result = solution.convert(text, rows);
        assertEquals("AB", result);
    }
}

//P A Y P A L I S H I R  I  N  G
//0 1 2 3 4 5 6 7 8 9 10 11 12 13

//13/3 = 4
//3 - 7
//P   A   H   N 0     4     8       12  %4==0
//A P L S I I G 1  3  5  7  9   11  13  %4!=0 && %4
//Y   I   R     2     6     10      14

//13/4 = 3
//4 - 5
//P      I      N  0      6        12
//A    L S    I G  1    5 7     11 13
//Y  A   H  R      2  4   8  10
//P      I         3      9

//13/5 = 2
//5 - 4
//P        S         0        8
//A      I H      G  1      7 9
//Y    L   I    N    2    6   10
//P  A     R  I      3  5     11  13
//P        I         4        12
