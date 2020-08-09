public class LargestPalindromeProduct {

  public static void main(String[] args) {
    System.out.println(findLargestPalindromeProduct(3));
  }

  public static int findLargestPalindromeProduct(int numberOfDigits) {

    String largestNumberString = "";
    for (int i = 0; i < numberOfDigits; i++) {
      largestNumberString += "9";
    }
    int largestNumber = Integer.parseInt(largestNumberString);
    for (int j = largestNumber; j > 0; j--) {
      if (isPalindrome(largestNumber * j)) {
        System.out.println(largestNumber);
        System.out.println(j);
        return largestNumber * j;
      }
    }
    return 0;
  }

  public static boolean isPalindrome(int number) {
    int originalNumber = number;
    int reversedNumber = 0;
    int remainder = 0;

    while (number != 0) {
      remainder = number % 10;
      reversedNumber = reversedNumber * 10 + remainder;
      number /= 10;
    }

    return originalNumber == reversedNumber;
  }
}
