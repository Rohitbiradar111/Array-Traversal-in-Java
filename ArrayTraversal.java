//This program does Array Traversal in Java i.e displays all the array elements

public class ArrayTraversal {
    public static void main(String args[])
    {
        //Method 1 -
        int arr[] = {10,20,30,40,50,60};
        System.out.print("arr = ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

        //Method 2 - 
        int arr1[] = {0,1,2,3,4,5};
        System.out.print("arr1 = ");
        for(int n : arr1)
        {
            System.out.print(n+" ");
        }
    }
}