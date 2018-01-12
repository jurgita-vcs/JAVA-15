package lt.vcs;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)

public class CalculatorTest {
    private static final int NUMBER = 1;
    private static final int NEGATIVE_NUMBER = -5;
    private int firstNumber;
    private int secondNumber;
    private int thirdNumber;
    private int expected;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {0, 1, 2, 2}, {3, 0, 2, 3}
        });
    }
    public CalculatorTest(int firstNumber, int secondNumber, int thirdNumber, int expected) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
        this.expected = expected;
    }

    @Test
    public void givenNumbers_whenFindingLargestNumber_thenLargestIsFound(){
        //given
        Calculator calculator = new Calculator();
        //when
        int largestNumber = calculator.findLargestNumber(firstNumber, secondNumber, thirdNumber);
        //then
        Assert.assertEquals("Should be equal", expected, largestNumber);
    }


    @Test
    public void givenEqualNumbers_whenCheckingIsNumbersEqual_thenReturnTrue(){
        //given
        Calculator calculator = new Calculator();
        //when
        boolean isEqual = calculator.isEqual(NUMBER, NUMBER);
        //then
        Assert.assertTrue("Should be equal", isEqual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenThreeNumbers_whenFindingLargestNumber_thenExeptionThrow(){
        //given
        Calculator calculator = new Calculator();
        //when
        calculator.findLargestNumber(NUMBER,NUMBER, NEGATIVE_NUMBER);
    }
}
