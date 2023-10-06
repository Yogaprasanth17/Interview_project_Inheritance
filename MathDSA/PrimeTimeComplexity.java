package MathDSA;

public class PrimeTimeComplexity {
    public static void main(String[] args){
        int num = 40;
        // as the array start for 0 we need to include the num we adding num + 1
        boolean[] primes = new boolean[num + 1];
        isPrime(num,primes);
    }  
    static void isPrime(int num,boolean[] primes) {
        // in boolean array initialy contains false     
        for (int i = 2; i <= Math.sqrt(num); i++) {
            // so new checking the false
            if(!primes[i]) {
                // we are making the multiples as true because that will the prime number
                for (int j = i*2; j <= num; j+=i) {
                    primes[j] = true;
                }
            }
        }
        for (int i = 2; i <= num; i++) {
            // check the false in the prime
            if (!primes[i]) {
                System.out.println(i);
            }
        }
    }
}
