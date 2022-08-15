public class EnhancedForArray {
    public static void main(String[] args) {
        int[] primes = {2, 3, 5, 7, 11, 13, -17, 19, 23, 29};

        for (int index = 0; index < primes.length; index++) {
            System.out.println(primes[index]);
        }

        // primes.for + enter
        int index = 0;
        for (int prime : primes) {
            System.out.print(index++);
            System.out.print(": ");
            System.out.println(prime);
        }
    }
}
