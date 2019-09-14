package task1;

import java.util.Arrays;

public class Week3Task1 {
    public int gcd(int a, int b) {
        while (b > 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }

    // compute the fibonacci of $n
    public int fibonacci(int n) {
        if (n == 0) 
            return 0;
        if (n == 1)
            return 1;
        int f, f_1 , f_2;
        f = 1;
        f_1 = 1;
        f_2 = 0;
        for(int i = 2; i <= n; i++) {
            f = f_1 + f_2;
            f_2 = f_1;
            f_1 = f; 
        }
        return f;
    }

    /**
     * print all prime numbers from 0 to $n use Sieve of Eratosthenes algorithm
     * useful link https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
     * notice that print each number in a line
     * @param n
     */
    public void sieveEratosthenes(int n) {
        boolean[] isPrime;
        isPrime = new boolean[n + 1];

        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        for(int i = 2; i * i <= n; i++) {
            if (isPrime[i] == true) {
                for(int j = i * 2; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        for(int i = 0; i <= n; i++) {
            if (isPrime[i] == true) {
                System.out.printf("%d ", i);
            }
        }
    } 
    public static void main(String[] args) {
        Week3Task1 week3Task1 = new Week3Task1();
        System.out.println(week3Task1.gcd(10, 2));
        System.out.println(week3Task1.fibonacci(5));
        week3Task1.sieveEratosthenes(50);
    }
}