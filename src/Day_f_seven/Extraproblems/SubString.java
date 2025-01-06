//Given an array of strings patterns and a string word, return the number of strings in patterns that exist as a substring in word.
//A substring is a contiguous sequence of characters within a string.

package Day_f_seven.Extraproblems;

public class SubString
{
    public static void main(String[] args) {
        String[] patterns={"a","bc","abc","d"};
        String word="abc";
        System.out.println(numOfStrings(patterns,word));
    }
    public static int numOfStrings(String[] patterns, String word)
    {
        int count=0;
        for(String str:patterns)
        {
            if(word.contains(str))
                count++;
        }
        return count;
    }
}
