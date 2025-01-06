package Day_f_seven.Extraproblems;

public class chips
{
    public static void main(String[] args) {
        int[] pos={1,2,3};
        System.out.println(minCostToMoveChips(pos));
    }
    public static int minCostToMoveChips(int[] position) {
        int evenCount = 0;
        int oddCount = 0;

        for (int pos : position) {
            if (pos % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        return Math.min(oddCount, evenCount);
    }
}
