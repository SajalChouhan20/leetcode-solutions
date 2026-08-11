import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> res = new ArrayList<>();

        if(s.length() < p.length()) return res;

        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : p.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        int left = 0;
        int right = 0;
        int count = map.size();

        while(right < s.length()){

            char c = s.charAt(right);

            if(map.containsKey(c)){
                map.put(c, map.get(c)-1);

                if(map.get(c) == 0){
                    count--;
                }
            }

            right++;

            while(count == 0){

                if(right - left == p.length()){
                    res.add(left);
                }

                char ch = s.charAt(left);

                if(map.containsKey(ch)){
                    map.put(ch, map.get(ch)+1);

                    if(map.get(ch) > 0){
                        count++;
                    }
                }

                left++;
            }
        }

        return res;
    }
}