import java.util.Arrays;

public class NandM1 {
    void go(int index, int n, int m, boolean[] c, int[] a) {
        if (index == m) {
            System.out.print(Arrays.toString(a));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (c[i]) {
                continue;
            }
            a[index] = i;
            c[i] = true;
            go(index + 1, n, m, c, a);
            c[i] = false;

        }
    }

    public static void main(String[] args) {
        boolean[] c = new boolean[3];
        int[] a = new int[3];
        NandM1 nandM1 = new NandM1();
        nandM1.go(0, 3, 3, c, a);
    }
}
