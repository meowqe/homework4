import java.lang.*;

public class MinToBegin {

    public static void transMin(int [] arr)
    {
        int min=arr[0],imin=0;
        int i_f,i_t;
        for (int i=1; i<arr.length; i++)
        {
            if (arr[i]<min)
            {
                imin=i;
                min=arr[i];
            }
        }
        i_t=imin;
        i_f=i_t-1;
        while(i_f>=0)
        {
            arr[i_t--]=arr[i_f--];
        }
        arr[0]=min;
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        int x[]={1,2,3,0,-1,3,9,-1,6};
        int i;
        System.out.print("Initial array: ");
        System.out.println();
        for (i=0; i<x.length; i++) System.out.print(x[i]+" ");
        System.out.println();
        transMin(x);
        System.out.print("Array after transormation: ");
        System.out.println();
        for (i=0; i<x.length; i++) System.out.print(x[i]+" ");
        System.out.println();
    }
}

