public class InsertionSort
{
    // Time Complexity = O(N^2)

    public static void main(String args[])
    {
        int nums[] = {8, 4, 7, 2, 9, 5};
        int size = nums.length;

        System.out.println("Before Sorting :-");
        for(int num : nums)
        {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println();


        System.out.println("While Sorting :-");
        for(int i=1; i<size; i++)
        {
            int key = nums[i];
            int j = i-1;

            while(j>=0 && nums[j]>key)
            {
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
            
            for(int num : nums)
            {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        
        System.out.println();
        System.out.println("After Sorting :-");
        for(int num : nums)
        {
            System.out.print(num + " "); 
        }

    }
}