import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EvenFibonacciNumbersTest {

  @Test
  public void testSumEvenFibonacciNumbers() {
    assertEquals(
        "Test case of Sum of Even Fibonacci sequence whose values do not exceed four million",
        4613732,
        EvenFibonacciNumbers.sumEvenFibonacciNumbers(4000000));
  }
}
