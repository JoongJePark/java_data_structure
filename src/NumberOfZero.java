public class NumberOfZero {
    public int number_of_two(int n) {
        int solution = 0;
        for (int i = 1; Integer.parseInt(String.valueOf(Math.round(Math.pow(2, i)))) <= n; i++) {
            solution += n / Math.pow(2, i);
        }
        System.out.println(solution);
        return solution;
    }

    public int number_of_m(int n, int m) {
        int solution = 0;
        for (int i = 1; Integer.parseInt(String.valueOf(Math.round(Math.pow(m, i)))) <= n; i++) {
            solution += n / Math.pow(m, i);
        }
        System.out.println(solution);
        return solution;
    }

    public static void main(String[] args) {
        NumberOfZero numberOfZero = new NumberOfZero();
        numberOfZero.number_of_two(10);
        numberOfZero.number_of_m(100, 3);
    }
}
