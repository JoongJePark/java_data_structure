import java.util.Arrays;

public class Eratosthenes {
    public static void main(String[] args) {
        int[] prime = new int[10000];
        int nOfPrime = 0;
        boolean[] check = new boolean[10001];
        int n = 10000;
        for (int i = 2; i < n; i++) {
            if (check[i] == false) {
                prime[nOfPrime] = i;
                nOfPrime += 1;
                for (int j = 2; i * j < n; j++) {
                    check[i * j] = true;
                }
            }
        }
        System.out.println(Arrays.toString(prime));
        System.out.println(nOfPrime);
        System.out.println(Arrays.toString(check));
    }
}
