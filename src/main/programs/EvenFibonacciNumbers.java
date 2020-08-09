public class EvenFibonacciNumbers {

  public static void main(String[] args) {
    System.out.println(sumEvenFibonacciNumbers(4000000));
  }

  public static int sumEvenFibonacciNumbers(int numberLimit) {

    int finalSum = 0;
    int evenSum = 0;
    int term1 = 0;
    int term2 = 1;
    int tempSum = 0;

    // tempSum is to make sure that finalSum doesn't exist the number limit, else the finalSum will
    // exceed number limit once
    while (tempSum <= numberLimit) {
      finalSum = term1 + term2;
      term1 = term2;
      term2 = finalSum;
      if (finalSum % 2 == 0) {
        evenSum = evenSum + finalSum;
      }
      tempSum = term1 + term2;
    }

    return evenSum;
  }
}
