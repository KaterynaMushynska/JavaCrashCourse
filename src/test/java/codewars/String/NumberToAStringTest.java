package codewars.String;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberToAStringTest {
    @Test
    public void tests() {
        assertEquals("67", NumberToAString.numberToString(67));
        assertEquals("123", NumberToAString.numberToString(123));
        assertEquals("999", NumberToAString.numberToString(999));
    }
}
