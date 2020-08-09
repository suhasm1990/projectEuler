import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestPrimeFactorTest {

  @Test
  public void testLargestPrimeFactor() {
    assertEquals(
        "Largest Prime Factor of 13195",
        29,
        LargestPrimeFactor.LargestPrimeFactorValue(Long.parseLong("13195")));
    assertEquals(
        "Largest Prime Factor of 600851475143",
        6857,
        LargestPrimeFactor.LargestPrimeFactorValue(Long.parseLong("600851475143")));
  }
}
