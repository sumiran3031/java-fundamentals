public class PrimeNumber {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Is 7 prime: " + isPrime(7));
        System.out.println("Is 10 prime: " + isPrime(10));

        System.out.print("Primes up to 50: ");
        for (int i = 2; i <= 50; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
