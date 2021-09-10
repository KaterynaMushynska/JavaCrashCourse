package codewars.Basic;

import com.Basic.YouCantCodeUnderPressure;
import org.junit.Assert;
import org.junit.Test;

public class YouCantCodeUnderPressureTest {
    @Test
    public final void test_all() {
        Assert.assertEquals("Nope!", 4, YouCantCodeUnderPressure.doubleInteger(2));
    }
}
