//For a string sequence, a string word is k-repeating if word concatenated k times is a substring of sequence. The word's maximum k-repeating value is the highest value k where word is k-repeating in sequence. If word is not a substring of sequence, word's maximum k-repeating value is 0.
//Given strings sequence and word, return the maximum k-repeating value of word in sequence.

package Day_f_seven.Extraproblems;

public class Sequence_number
{
    public static void main(String[] args) {
        String sequence="abababa";
        String word="ab";
        System.out.println(maxRepeating(sequence,word));

    }
        public static int maxRepeating(String sequence, String word) {
            int maxRepeat = 0;
            StringBuffer repeatWord = new StringBuffer(word);

            while (sequence.contains(repeatWord.toString())){
                maxRepeat++;
                repeatWord.append(word);
            }

            return maxRepeat;

    }

}
