package codewars.Loops;

import com.Loops.NearestSquareNumber;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NearestSquareNumberTest {
    @Test
    public void basicTests() {
        assertEquals(1, NearestSquareNumber.nearestSq(1));
        assertEquals(1, NearestSquareNumber.nearestSq(2));
        assertEquals(9, NearestSquareNumber.nearestSq(10));
        assertEquals(121, NearestSquareNumber.nearestSq(111));
        assertEquals(10000, NearestSquareNumber.nearestSq(9999));
    }
}
