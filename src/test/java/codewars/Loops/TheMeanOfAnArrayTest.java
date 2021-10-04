package codewars.Loops;

import com.Loops.TheMeanOfAnArray;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TheMeanOfAnArrayTest {
    @Test
    public void simpleTest() {
        assertEquals(2, TheMeanOfAnArray.getAverage(new int[]{2, 2, 2, 2}));
        assertEquals(3, TheMeanOfAnArray.getAverage(new int[]{1, 2, 3, 4, 5}));
        assertEquals(1, TheMeanOfAnArray.getAverage(new int[]{1, 1, 1, 1, 1, 1, 1, 2}));
    }
}
