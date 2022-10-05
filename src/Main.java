import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int array[] = {8,1,0,5,-3,6,0,9};
        int b = array[0];

        m:for(int i = 1; i < array.length; ++i) {
            if(b > 0){
                if(array[i] < b && array[i] > 0)
                    b = array[i];
            }else
                b = array[i];

            System.out.println(b);
            break m;
        }





    }

}





