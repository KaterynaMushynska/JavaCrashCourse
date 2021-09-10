package codewars.Basic;

import com.Basic.PixelArtPlanning;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PixelArtPlanningTest {
    @Test
    public void fixedTests() {
        assertTrue(PixelArtPlanning.isDivisible(4050, 27));
        assertTrue(PixelArtPlanning.isDivisible(10000, 20));
        assertTrue(PixelArtPlanning.isDivisible(10005, 1));
        assertFalse(PixelArtPlanning.isDivisible(4066, 27));
        assertFalse(PixelArtPlanning.isDivisible(10005, 2));
    }
}
