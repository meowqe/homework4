import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = n%10;
        String a = String.valueOf(n);
        switch (x) {
            case 1:
                a = "TORT";
                break;
            case 2:
            case 3:
            case 4:
                a = "TORTA";
                break;
            case 0:
            case 5:
            case 6 & 7:
                a = "TORTOV";
                break;
            case 8 & 9:
                a = "TORTOV";



        }
        System.out.println(a);
    }
}