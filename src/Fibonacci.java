import java.util.Arrays;

public class Fibonacci {
    int[] memo = new int[10000];
    int nthFibonacci(int n){
        if(n <=1){
            memo[n]=n;
            return n;
        } else {
            if(memo[n] >0){
                return memo[n];
            }
            memo[n] = nthFibonacci(n-1)+nthFibonacci(n-2);
            return memo[n];
        }
    }
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.nthFibonacci(15);
        StringBuilder sb = new StringBuilder();
        sb.append(Arrays.toString(fibonacci.memo));
        System.out.println(sb);
    }
}
