package Day_g_Eight;

import java.util.ArrayList;

public class NextGreaterElement
{
    public static void main(String[] args) {
        int[] nums1={1,2,3,4,5};
        int[] nums2={2,1,3};
        System.out.println(nextGreaterElement(nums1,nums2));
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2)
    {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i:nums2)
        {
            arr.add(i);
        }
        for(int i=0;i<nums1.length;i++)
        {
            int idx=arr.indexOf(nums1[i]);
            if(idx<nums2.length-1)
            {
                for(int j=idx+1;j<nums2.length;j++)
                {
                    if(arr.get(idx)<arr.get(j))
                    {
                        nums1[i]=arr.get(j);
                        break;
                    }
                    if(j==nums2.length-1)
                    {
                        nums1[i]=-1;
                    }
                }
            }
            else
            {
                nums1[i]=-1;
            }
        }
        return nums1;
    }


}
