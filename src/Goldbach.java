import java.util.Arrays;
import java.util.stream.IntStream;

public class Goldbach {
    public boolean prime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 100;
        int[] gold = new int[n];
        int[] prime = new int[n];
        int nOfPrime = 0;
        boolean[] check = new boolean[n + 1];
        for (int i = 2; i < n; i++) {
            if (check[i] == false) {
                prime[nOfPrime] = i;
                nOfPrime += 1;
                for (int j = 2; i * j < n; j++) {
                    check[i * j] = true;
                }
            }
        }
        for (int j = 3; j < n; j++) {
            for (int i : prime) {
                if (IntStream.of(prime).anyMatch(x -> x == j - i)) {
                    gold[j] = i;
                }
            }
        }
        System.out.println(Arrays.toString(prime));


    }
}
