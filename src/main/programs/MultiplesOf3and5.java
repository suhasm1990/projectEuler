public class MultiplesOf3and5 {

    public static void main(String[] args) {
        System.out.println(sumOfMultiplesOf3and5(1000));
    }

    public static int sumOfMultiplesOf3and5(int numberLimit){

        int sumOfMultiplesOf3and5 = 0;

        for(int i=0;i<numberLimit;i++){

            if(i%3==0 || i%5==0){
                sumOfMultiplesOf3and5=sumOfMultiplesOf3and5+i;
            }

        }

        return sumOfMultiplesOf3and5;
    }


}
