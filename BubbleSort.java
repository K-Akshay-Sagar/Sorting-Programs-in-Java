public class BubbleSort
{
    // Time Complexity = O(N^2)

    public static void main(String args[])
    {
        int nums[] = {6, 4, 8, 2, 1, 5};
        int size = nums.length;
        int temp = 0;

        System.out.println("Before Sorting :-");
        for (int num : nums)
        {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println();


        System.out.println("While Sorting :-");
        for(int i=0; i<size-1; i++)
        {
            for(int j=0; j<size-i-1; j++) // We don't need to check last i'th elements after each iterations, because they are already sorted. 
            {
                if(nums[j] > nums[j+1])
                {
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }

            for(int num : nums)
            {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        
        System.out.println();
        System.out.println("After Sorting :-");
        for (int num : nums)
        {
            System.out.print(num + " ");
        }
    }
}