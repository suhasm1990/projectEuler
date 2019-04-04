import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MultiplesOf3and5Test {

    @Test
    public void testSumMultiplesOf3and5(){
        assertEquals("Test case for Sum of Multiples of 3 or 5 below 10", 23, MultiplesOf3and5.sumOfMultiplesOf3and5(10));
        assertEquals("Test case for Sum of Multiples of 3 or 5 below 1000", 233168, MultiplesOf3and5.sumOfMultiplesOf3and5(1000));
    }

}
