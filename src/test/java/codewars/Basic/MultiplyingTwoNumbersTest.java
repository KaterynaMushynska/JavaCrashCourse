package codewars.Basic;

import com.Basic.MultiplyingTwoNumbers;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplyingTwoNumbersTest {
    MultiplyingTwoNumbers M = new MultiplyingTwoNumbers();

    @Test
    public void sampleTest() {
        assertEquals(4, M.multiply(2, 2));
        assertEquals(10, M.multiply(5, 2));
        assertEquals(100, M.multiply(100, 1));
        assertEquals(0, M.multiply(0, 1000));
    }
}
