//Given a string s, return true if the s can be palindrome after deleting at most one
// character from it.

package Day_f_seven.Extraproblems;

public class palindrome
{
    public static void main(String[] args) {
        System.out.println(validPalindrome("kalai"));
    }

        public static boolean validPalindrome(String s) {
            int start = 0;
            int end = s.length() - 1;

            while (start <= end) {
                if (s.charAt(start) == s.charAt(end)) {
                    start++;
                    end--;
                } else {
                    // Removing the character
                    return palin(s, start + 1, end) || palin(s, start, end - 1);
                }
            }
            return true;
        }

        public static boolean palin(String s, int start, int end) {
            while (start <= end) {
                if (s.charAt(start) == s.charAt(end)) {
                    start++;
                    end--;
                } else {
                    return false;
                }
            }
            return true;
        }

}
