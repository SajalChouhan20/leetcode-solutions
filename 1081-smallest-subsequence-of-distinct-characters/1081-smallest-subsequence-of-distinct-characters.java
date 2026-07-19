class Solution {
    public String smallestSubsequence(String s) {
        if(s.length()==0) return "";
         int[] latestCh=new int[26];
         for(int i=0;i<s.length();i++){
            latestCh[s.charAt(i)-'a']++;
         }
         int pos=0;
         for(int i=0;i<s.length();i++){
            if(s.charAt(i)<s.charAt(pos)){
                pos=i;
            }
            latestCh[s.charAt(i)-'a']--;
            if(latestCh[s.charAt(i)-'a']==0) break;
         }
         char first=s.charAt(pos);
         
        String remaining = s.substring(pos + 1).replaceAll("" + first, "");

        return first + smallestSubsequence(remaining);
    }
}