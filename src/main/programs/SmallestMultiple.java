public class SmallestMultiple {
  public static void main(String[] args) {
    System.out.println("The smallest number with all multiples range is: " + smallestNumber(20));
  }

  private static int smallestNumber(int n) {
    for (int j = 1; j <= Integer.MAX_VALUE; j++) {
      if (check(j, n)) {
        return j;
      }
    }
    return 0;
  }

  private static Boolean check(int num, int n) {
    for (int i = 1; i <= n; i++) {
      if (num % i == 0) {
        if (i == n) {
          return true;
        }
      } else {
        return false;
      }
    }
    return false;
  }
}
