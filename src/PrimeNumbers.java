
public class PrimeNumbers {

    public static void main(String[] args) {
        int n;
        n = Integer.parseInt(args[0]);
//            if (n<3){
//                System.out.println(n);
//            }
//            else{
//                System.out.println( "n is larger than 3");
//
//            }
        int[] primes = new int[n + 1];
        int number_of_primes = 0;
        for (int x = 2; x <= 1000; x++) {

            for (int j = 0; j <= number_of_primes; j++) {
                if (j == number_of_primes) {
                    primes[number_of_primes] = x;
                    number_of_primes++;
                    break;
                }
                if (x % primes[j] == 0) {
                    break;
                }
//                        System.out.print(x);
                //Same thing as System.out.println(primes[j]);
//                        if(j != n-1) {
//                            System.out.print(", ");
//                        }
            }
            if (number_of_primes > n) {
                break;
            }
        }

        for (int i = 0; i < n; i++) {

            System.out.print(primes[i]);
            System.out.print(", ");
//            System.out.println(tab[]);
//            for(int i=0;i<=n;i=i+1){
//                System.out.println(i);
//                if (i%2 == 1) {
//                    System.out.println(i);
//                }
//            }

        }
    }
}