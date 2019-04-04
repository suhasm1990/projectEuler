public class LargestPrimeFactor {

    public static void main(String[] args){
        System.out.println(LargestPrimeFactorValue(Long.parseLong("600851475143")));
    }

    public static int LargestPrimeFactorValue(long number){

        int LargestPrimeFactor = 2;
        for(int i=2;i<=number;i++){

            while(number%i == 0){
                LargestPrimeFactor = Math.max(LargestPrimeFactor, i);
                number = number/i;
            }

        }
        return LargestPrimeFactor;

    }

}
