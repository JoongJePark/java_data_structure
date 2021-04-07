import java.util.Arrays;

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

    public static boolean compare_data(int[] input_array, int input_data) {
        for (int num : input_array) {
            if (num == input_data)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 10000;
        int[] gold = new int[n];
        int[] prime = new int[n];
        int nOfPrime = 0;
        boolean[] check = new boolean[n + 1];
        for (int i = 2; i < n; i++) {
            if (!check[i]) {
                prime[nOfPrime] = i;
                nOfPrime += 1;
                for (int j = 2; i * j < n; j++) {
                    check[i * j] = true;
                }
            }
        }
        for (int i = 2; i * 2 < n; i++) {
            for (int j : prime) {
                if (compare_data(prime, 2 * i - j)) {
                    gold[i] = j;
                    System.out.println(2*i);
                    System.out.println(j);
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(gold));


    }
}
