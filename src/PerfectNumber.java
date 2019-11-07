public class PerfectNumber {

    public static boolean isPerfectNumber(int number){

        if (number <1){

            return false;
        }else{
            int properDivisor = 0;
            for (int i = 1; i < number ; i++){

                if( number % i == 0){
                    System.out.println(i);
                    properDivisor = properDivisor + i;
                    System.out.println(properDivisor);
                    }


                }
            if(properDivisor == number){

                return true;
            }else{
                return false;
            }


        }

    }
}
