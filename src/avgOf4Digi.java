import java.util.Arrays;
import java.util.Scanner;

public class avgOf4Digi {
    public static void main(final String[] args) {
        try (final var scanner = new Scanner(System.in)) {
            final var n = scanner.nextInt();
            final var a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            System.out.printf("%.2f", MyArrays(a));
        }
    }

    private static double MyArrays(final int[] a) {
        return MyArrays(a, 4);
    }

    private static double MyArrays(final int[] a, final int k) {
        return Arrays.stream(a)
                .filter(x -> String.valueOf(x).length() == k)
                .average()
                .orElse(-1);
    }
}


