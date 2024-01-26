public class QuickSort
{
    // Time Complexity = O(N logN) -> average case
    // Time Complexity = O(N^2) -> worst case (when the array will be sorted and we select smallest or largest indexed element as pivot).

    private static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = low - 1;

        for(int j=low; j<high; j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;

        for(int num : arr)
            {
                System.out.print(num + " ");
            }
            System.out.println();


        return i;
    }


    public static void quickSort(int[] arr, int low, int high)
    {
        if(low<high)
        {
            int pidx = partition(arr, low, high);

            quickSort(arr, low, pidx-1);
            quickSort(arr, pidx+1, high);
        }
    }


    public static void main(String args[])
    {
        int arr[] = {5, 6, 2, 3, 1, 8, 4};
        int size = arr.length;

        System.out.println("Before Sorting :-");
        for(int num : arr)
        {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println();


        System.out.println("While Sorting :-");
        quickSort(arr, 0, size-1);

        
        System.out.println();
        System.out.println("After Sorting :-");
        for(int num : arr)
        {
            System.out.print(num + " "); 
        }

    }
}