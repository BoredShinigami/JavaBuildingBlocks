import java.math.*;
public class Bubble
{
   public static void main(String[] args)
   {
       int[] arr = new int[10];
       boolean swapped = false;
       int swapSpace;
       int last = arr.length-1;
       int track = 0;
       
       for(int i = 0; i < arr.length; i++)
       {
           arr[i] = (int)(500*Math.random());
           System.out.print(arr[i] + " ");
       }
       
       do
       {
           swapped = false;
           for(int j = 0; j < last; j++)
           {
               if(arr[j] > arr[j+1])
               {
                   swapSpace = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = swapSpace;
                   swapped = true;
                   track = j;
               }
           }
           last = track;
       }
       while(swapped);
       
       System.out.print("\nSorted - ");
        for(int k = 0; k < arr.length; k++)
       {
           System.out.print(arr[k] + ", ");
       }
   }
}
