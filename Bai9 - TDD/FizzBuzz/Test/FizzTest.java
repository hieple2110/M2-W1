import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzTest {

    @Test
    void fizzBuzz() {
        int number =5;
        String expected = "Buzz";
        String result = Fizz.FizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void fizzBuzz1() {
        int number =9;
        String expected = "Fizz";
        String result = Fizz.FizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void fizzBuzz2() {
        int number =7;
        String expected = "7";
        String result = Fizz.FizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void fizzBuzz3() {
        String number = "03";
        String expected = "kFizz";
        String result = "";
        for(int i =0; i<number.length(); i++){
            result+=Contains.Contain(String.valueOf(number.charAt(i)));
        }

        assertEquals(expected, result);
    }

    @Test
    void fizzBuzz4() {
        String number = "33";
        String expected = "FizzFizz";
        String result = "";
        for(int i =0; i<number.length(); i++){
            result+=Contains.Contain(String.valueOf(number.charAt(i)));
        }

        assertEquals(expected, result.toString());
    }

    @Test
    void fizzBuzz5() {
        String number = "25";
        String expected = "haiBuzz";
        String result = "";
        for(int i =0; i<number.length(); i++){
            result+=Contains.Contain(String.valueOf(number.charAt(i)));
        }

        assertEquals(expected, result.toString());
    }
}