import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void arrayReplace() {
        FizzBuzz testFizz = new FizzBuzz();
        ArrayList<String> testInput = new ArrayList<>(Arrays.asList("fightclub", "yomomma", "reverb", "fugettaboutit"));
        ArrayList<String> testAnswer = new ArrayList<>(Arrays.asList("FizzBuzz", "yomomma", "Buzz", "Fizz"));
        ArrayList<String> solveForArray = testFizz.inputRecur(testInput);
        assertEquals(testAnswer, solveForArray);
    }

    @Test
    void nullArrayTest() {
        FizzBuzz testFizz = new FizzBuzz();
        ArrayList<String> testInput = new ArrayList<>(Arrays.asList(null, null, null));
        ArrayList<String> testAnswer = new ArrayList<>(Arrays.asList(null, null, null));
        ArrayList<String> solveForArray = testFizz.inputRecur(testInput);
        assertEquals(testAnswer, solveForArray);    }



}