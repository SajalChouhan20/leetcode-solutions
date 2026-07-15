class Solution {
    public int maxRepeating(String sequence, String word) {
        int count=0;
        String curr=word;
        while(sequence.contains(curr)){
            count++;
            curr+=word;
        }
        return count;
        // int count = 0;

        // for (int i = 0; i <= sequence.length() - word.length(); i++) {
        //     if (sequence.substring(i, i + word.length()).equals(word)) {
        //         count++;
        //     }
        // }

        // return count;
    }
}