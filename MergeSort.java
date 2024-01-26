public class MergeSort
{
    //Time Complexity = O(N logN)

    public static void conquer(int[] arr, int left,int mid, int right)
    {
        int merged[] = new int[right - left + 1];

        int idx1 = left;
        int idx2 = mid+1;
        int x = 0;

        // O(N)
        while(idx1 <= mid && idx2 <= right)
        {
            if(arr[idx1] <= arr[idx2])
            {
                merged[x++] = arr[idx1++];
            }
            else
            {
                merged[x++] = arr[idx2++];
            }
        }

        while(idx1 <= mid)
        {
            merged[x++] = arr[idx1++];
        }

        while(idx2 <= right)
        {
            merged[x++] = arr[idx2++];
        }

        for(int i=0, j=left; i<merged.length; i++, j++)
        {
            arr[j] = merged[i];
        }

        for(int num : arr)
        {
            System.out.print(num + " ");
        }
            System.out.println();
    }


    public static void divide(int[] arr, int left, int right)
    {
        if(left>=right)
        {
            return;
        }

        // O(logN)
        int mid = left + (right - left)/2;
        divide(arr, left, mid);
        divide(arr, mid+1, right);
        conquer(arr, left, mid, right);
    }


    public static void main(String args[])
    {
        int arr[] = {69, 2, 51, 18, 111, 84};
        int size = arr.length;

        System.out.println("Before Sorting :-");
        for(int num : arr)
        {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println();


        System.out.println("While Sorting :-");
        divide(arr, 0, size-1);


        System.out.println();
        System.out.println("After Sorting :-");
        // for(int num : arr)
        // {
        //     System.out.print(num + " "); 
        // }


        for(int i=0; i<size; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}