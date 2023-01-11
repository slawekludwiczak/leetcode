package permutations;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void leetCodeTest1() {
        int[] nums = {1, 2, 3};
        List<List<Integer>> expectedResult = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(1, 3, 2),
                Arrays.asList(2, 1, 3),
                Arrays.asList(2, 3, 1),
                Arrays.asList(3, 1, 2),
                Arrays.asList(3, 2, 1)
        );
        List<List<Integer>> result = solution.permute(nums);
        assertTrue(expectedResult.containsAll(result) && expectedResult.size() == result.size());
    }

    @Test
    void leetCodeTest2() {
        int[] nums = {0, 1};
        List<List<Integer>> expectedResult = Arrays.asList(
                Arrays.asList(0, 1),
                Arrays.asList(1, 0)
        );
        List<List<Integer>> result = solution.permute(nums);
        assertEquals(expectedResult, result);
    }

    @Test
    void leetCodeTest3() {
        int[] nums = {1};
        List<List<Integer>> expectedResult = List.of(
                List.of(1)
        );
        List<List<Integer>> result = solution.permute(nums);
        assertEquals(expectedResult, result);
    }

    @Test
    void leetCodeTest4() {
        int[] nums = {5,4,6,2};
        List<List<Integer>> expectedResult = List.of(
                List.of(1)
        );
        List<List<Integer>> result = solution.permute(nums);
        assertEquals(expectedResult, result);
    }

}
