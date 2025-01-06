package Day_g_Eight;

public class maxSubarray
{
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums)
    {
        int max=nums[0];
        int sum=0;
        for(int num:nums)
        {
            sum+=num;
            max=Math.max(max,sum);
            if(sum<0)
                sum=0;
        }

        return max;

    }
}
