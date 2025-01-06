//Write a function to rotate an array of n integers to the right by k steps.

package Day_g_Eight;

public class Rotate
{
    public static void main(String[] args)
    {
        int[] nums={1,2,3,4,5,6,7};
        int k=3;
       rotate(nums,k);
       for(int n:nums)
       {
           System.out.print(n);
       }
    }
        public static void rotate(int[] nums, int k) {
            int n = nums.length;
            k = k % n;
            int[] rotated = new int[n];

            for (int i = 0; i < n; i++) {
                rotated[(i + k) % n] = nums[i];
            }

            for (int i = 0; i < n; i++) {
                nums[i] = rotated[i];
            }
        }

}
