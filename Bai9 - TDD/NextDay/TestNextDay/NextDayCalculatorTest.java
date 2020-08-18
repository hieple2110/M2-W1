import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    @DisplayName("1/1/2020")
    void nextDayCalculator() {
        int day = 1;
        int month = 1;
        int year = 2020;
        String expected ="2/1/2020";

        String result =  NextDayCalculator.NextDayCalculator1(day , month , year);
        assertEquals(result,expected);
    }

    @Test
    @DisplayName("31/1/2020")
    void nextDayCalculator1() {
        int day = 31;
        int month = 1;
        int year = 2020;
        String expected ="1/2/2020";

        String result = NextDayCalculator.NextDayCalculator1(day , month , year);
        assertEquals(result,expected);
    }

    @Test
    @DisplayName("30/4/2020")
    void nextDayCalculator2() {
        int day = 30;
        int month = 4;
        int year = 2020;
        String expected ="1/5/2020";

        String result = NextDayCalculator.NextDayCalculator1(day , month , year);
        assertEquals(result,expected);
    }

    @Test
    @DisplayName("28/2/2020")
    void nextDayCalculator3() {
        int day = 28;
        int month = 2;
        int year = 2020;
        String expected ="29/2/2020";

        String result = NextDayCalculator.NextDayCalculator1(day , month , year);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("29/2/2020")
    void nextDayCalculator4() {
        int day = 29;
        int month = 2;
        int year = 2020;
        String expected ="1/3/2020";

        String result = NextDayCalculator.NextDayCalculator1(day , month , year);
        assertEquals(result,expected);
    }

    @Test
    @DisplayName("31/12/2020")
    void nextDayCalculator5() {
        int day = 31;
        int month = 12;
        int year = 2020;
        String expected ="1/1/2021";

        String result = NextDayCalculator.NextDayCalculator1(day , month , year);
        assertEquals(expected,result);
    }

}