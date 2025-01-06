//Given an array of integers nums and an integer target,
// return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution,
// and you may not use the same element twice.
//You can return the answer in any order.

package Day_g_Eight;

public class TwoSum
{
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9};
        System.out.println(twoSum(arr,16));
    }
        public static int[] twoSum(int[] nums, int target) {
            for (int i = 1; i < nums.length; i++) {
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] + nums[j - i] == target) {
                        return new int[] { j, j - i };
                    }
                }
            }
            return null;
        }


}
