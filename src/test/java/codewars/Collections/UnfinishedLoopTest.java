package codewars.Collections;

import com.Collections.UnfinishedLoop;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class UnfinishedLoopTest {
    UnfinishedLoop unfinishedLoop = new UnfinishedLoop();

    @Test
    public void SampleTests() {
        assertEquals(Arrays.asList(1), unfinishedLoop.CreateList(1));
        assertEquals(Arrays.asList(1, 2), unfinishedLoop.CreateList(2));
        assertEquals(Arrays.asList(1, 2, 3), unfinishedLoop.CreateList(3));
        assertEquals(Arrays.asList(1, 2, 3, 4), unfinishedLoop.CreateList(4));
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), unfinishedLoop.CreateList(5));
    }
}
