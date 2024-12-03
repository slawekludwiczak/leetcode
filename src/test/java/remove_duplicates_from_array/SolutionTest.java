package remove_duplicates_from_array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("inputProvider")
    void leetCodeTest(int[] array, int[] expectedArray, int expectedResult) {
        int result = solution.removeDuplicates(array);
        assertArrayEquals(expectedArray, Arrays.copyOf(array, result));
        assertEquals(expectedResult, result);
    }

    static Stream<Arguments> inputProvider() {
        return Stream.of(
                Arguments.of(
                        new int[]{1, 1, 2},
                        new int[]{1, 2},
                        2
                ),
                Arguments.of(
                        new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4},
                        new int[]{0, 1, 2, 3, 4},
                        5
                )
        );
    }
}