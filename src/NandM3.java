import java.util.Arrays;

//몇개까지 중복허용인지도 추가
public class NandM3 {
    private void go(int index, int n, int m, int[] c, int[] a, int d) {
        if (index == m) {
            System.out.println(Arrays.toString(a));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (c[i] >= d) {
                continue;
            }
            a[index] = i;
            c[i] += 1;
            go(index + 1, n, m, c, a, d);
            c[i] -= 1;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[3];
        int[] c = new int[4];
        Arrays.fill(c, 0);
        NandM3 nandM3 = new NandM3();
        nandM3.go(0, 4, 3, c, a, 2);
    }
}
