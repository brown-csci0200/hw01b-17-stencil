package sol;
// Note:  Normally our test files live in package "test", but for this homework
// your version will be in package "sol" because of how we are grading your tests.


import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * Tests for Homework 1B
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Homework1BTest {

    @Test
    public void testExample() {
        Assert.assertEquals(2, 1 + 1);
    }
}
