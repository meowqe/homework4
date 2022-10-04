import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] array= {7, 8, 9, 10, 11};
        for (int i = 0; i < array.length / 2; i++) {
            array[i] = array[array.length - i - 1];
            System.out.println(Arrays.toString(array));
        }


        }




    }












