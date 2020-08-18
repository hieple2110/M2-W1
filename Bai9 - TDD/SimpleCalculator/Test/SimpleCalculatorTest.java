import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleCalculatorTest {

    @Test
    @DisplayName("test 0 + 0")
    void add0and0() {
        int a = 0;
        int b = 0;
        int expected = 0;

        int result = SimpleCalculator.add(a, b);
        assertEquals(expected, result);

    }

    @Test
    @DisplayName("test 0 + 1")
    void add0and1() {
        int a = 0;
        int b = 1;
        int expected = 1;

        int result = SimpleCalculator.add(a, b);
        assertEquals(expected, result);
    }


    @Test
    @DisplayName("test 0 + -1")
    void add0and() {
        int a = 0;
        int b = -1;
        int expected = -1;

        int result = SimpleCalculator.add(a, b);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("test 0 - 0")
    void sub0and() {
        int a = 0;
        int b = 0;
        int expected = 0;

        int result = SimpleCalculator.sub(a, b);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("test 0 - 4")
    void sub0and4() {
        int a = 0;
        int b = 4;
        int expected = -4;

        int result = SimpleCalculator.sub(a, b);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("test 2 - (-5)")
    void sub() {
        int a = 2;
        int b = -5;
        int expected = 7;

        int result = SimpleCalculator.sub(a, b);
        assertEquals(expected, result);
    }

}