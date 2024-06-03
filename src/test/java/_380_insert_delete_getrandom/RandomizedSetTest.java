package _380_insert_delete_getrandom;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomizedSetTest {

    RandomizedSet set;

    @BeforeEach
    void init() {
        set = new RandomizedSet();
    }


    @Test
    void shouldNotThrowOnInsert() {
        assertDoesNotThrow(() -> set.insert(5));
    }

    @Test
    void shouldReturnTrueWhenInsertingUniqueElements() {
        assertTrue(set.insert(5));
        assertTrue(set.insert(10));
    }

    @Test
    void shouldReturnFalseOnDuplicate() {
        set.insert(5);
        assertFalse(set.insert(5));
    }

    @Test
    void shouldReturnFalseWhenDeletingNotExistingElement() {
        set.insert(5);
        assertFalse(set.remove(10));
    }

    @Test
    void shouldReturnTrueWhenDeletingExistingElement() {
        set.insert(5);
        assertTrue(set.remove(5));
    }

    @Test
    void shouldReturnAlwaysSameElementForSingleSet() {
        set.insert(5);
        assertEquals(5, set.getRandom());
        assertEquals(5, set.getRandom());
        assertEquals(5, set.getRandom());
    }

    @Test
    void shouldReturnRandomValueForMultipleElements() {
        set.insert(5);
        set.insert(10);
        set.insert(15);
        int random = set.getRandom();
        assertTrue(random == 5 || random == 10 || random == 15);
    }

}