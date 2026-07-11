class Solution {

    public Boolean isSubString(String s, int start, int end){
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public String longestPalindrome(String s) {
        String longest = "";

        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                if(isSubString(s, i, j)){
                    if(j - i + 1 > longest.length()){
                        longest = s.substring(i, j + 1);
                    }
                }
            }
        }
        return longest;
    }
}