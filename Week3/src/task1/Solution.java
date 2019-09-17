
import java.util.Arrays;
import java.util.Scanner;

//import your library
public class Solution {
    public static void sieveEratosthenes(int n) {
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
        Scanner scanner = new Scanner(System.in);
        Solution.sieveEratosthenes(scanner.nextInt());
    }
}