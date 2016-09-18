import java.util.Arrays;
public class Sort
{
    public static void main(String[] args)
    {
        String[] names = {"Gandalf","Legolas","Merry","Gimli","Pipin","Sam","Frodo","Aragorn","Boromir"};
        int[] nums = {2,9,5,6,1,4,7,8,3};
        display(names);
        display(nums);
        Arrays.sort(names);
        Arrays.sort(nums);
        display(names);
        display(nums);
    }
    public static void display(String[] elems)
    {
        System.out.println("\nString Array:");
        for(int i = 0; i < elems.length; i++)
        {
            System.out.println("Element " + i + " is " + elems[i]);
        }
    }
    public static void display(int[] elems)
    {
        System.out.println("\nInteger Array:");
        for(int i = 0; i < elems.length; i++)
        {
            System.out.println("Element " + i + " is " + elems[i]);
        }
    }
}
