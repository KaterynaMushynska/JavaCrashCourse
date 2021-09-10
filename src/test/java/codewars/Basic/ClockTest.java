package codewars.Basic;

import com.Basic.Clock;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClockTest {
    @Test
    public void test1() {
        assertEquals(61000, Clock.Past(0, 1, 1));
    }

}
