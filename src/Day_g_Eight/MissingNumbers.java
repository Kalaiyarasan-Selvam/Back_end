package Day_g_Eight;

import java.util.Comparator;

public class MissingNumbers
{
    public static void main(String[] args) {
        int[] nums= new int[]{1, 2, 0};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        int n=nums.length;

        int total=n*(n+1)/2;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
        }
        return total-sum;
    }
}
