import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteTest {

    @Test
    void findAbsolute() {
        int number = 0;
        int expected = 0;

        int result = Absolute.findAbsolute(0);
        assertEquals(expected, result);
    }

    @Test
    void findAbsolute1() {
        int number = 1;
        int expected = 1;

        int result = Absolute.findAbsolute(1);
        assertEquals(expected, result);
    }

    @Test
    void findAbsolute2() {
        int number = -1;
        int expected = 1;

        int result = Absolute.findAbsolute(-1);
        assertEquals(expected, result);
    }


}