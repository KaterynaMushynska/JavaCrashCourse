package codewars.Basic;

import com.Basic.GrasshopperDebug;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GrasshopperDebugTest {
    @Test
    public void testA() {
        assertEquals("10.0 is above freezing temperature", GrasshopperDebug.weatherInfo(50));
    }

    @Test
    public void testB() {
        assertEquals("-5.0 is freezing temperature", GrasshopperDebug.weatherInfo(23));
    }
}
