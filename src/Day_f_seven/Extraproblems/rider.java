//here is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes.
// The biker starts his trip on point 0 with altitude equal 0.
//You are given an integer array gain of length n where gain[i] is the net gain in al
// titude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.

package Day_f_seven.Extraproblems;

public class rider
{
    public static void main(String[] args)
    {
        int[] gain={1,2,3,4,5,};
        System.out.println(largestAltitude(gain));
    }
    public static int largestAltitude(int[] gain)
{
    int s=0;
    int max=Integer.MIN_VALUE;
    for(int i:gain)
    {
        s+=i;
        max=Math.max(s,max);
    }
    if(max<0)
        return 0;

    return max;

}

}
