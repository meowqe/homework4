import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] a = {5, 1, 5, 2, 4, 3};
        for (int i=1; i<a.length-1; ++i)
            if (a[i] > a[i-1]) {
                System.out.println(a[i]);
            }



    }
}





