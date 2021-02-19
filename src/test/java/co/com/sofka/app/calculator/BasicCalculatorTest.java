package co.com.sofka.app.calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class BasicCalculatorTest {
    private final BasicCalculator basicCalculator = new BasicCalculator();
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Testing sum: 1+1=2")
    public void sum() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.sum(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.sum(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

    @DisplayName("Testing several divs")
    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
            "0,    0,   NaN",
            "1,    2,   0.5",
            "4,  2, 2",
            "15,  5, 3"
    })
    public void severalDivs(double first, double second, double expectedResult) {
        assertEquals(expectedResult, basicCalculator.div(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

    @DisplayName("Testing several multiplier")
    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "0,    0,   0",
            "1,    2,   2",
            "4,  2, 8",
            "5,  5, 25"
    })
    public void severalMultiplier(long first, long second, long expectedResult) {
        assertEquals(expectedResult, basicCalculator.multiplicar(first, second),
                () -> first + " * " + second + " should equal " + expectedResult);
    }

    @DisplayName("Testing several rest")
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "0,    0,   0",
            "1,    2,   -1",
            "4,  2, 2",
            "5,  5, 0"
    })
    public void severalRest(long first, long second, long expectedResult) {
        assertEquals(expectedResult, basicCalculator.resta(first, second),
                () -> first + " - " + second + " should equal " + expectedResult);
    }
}