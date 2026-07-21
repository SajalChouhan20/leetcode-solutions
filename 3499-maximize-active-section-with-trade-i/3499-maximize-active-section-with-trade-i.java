class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        String t= "1"+s+"1";
        int base=0;
        for(char ch:s.toCharArray()){
            if(ch=='1'){
                base++;
            }
        }
        ArrayList<Character> chars = new ArrayList<>();
        ArrayList<Integer> lens = new ArrayList<>();

        int i = 0;
        while (i < t.length()) {
            int j = i;
            while (j < t.length() && t.charAt(j) == t.charAt(i)) {
                j++;
            }
            chars.add(t.charAt(i));
            lens.add(j - i);
            i = j;
        }

        int ans = base;

        for (i = 1; i < chars.size() - 1; i++) {
            if (chars.get(i) == '1') {
                ans = Math.max(ans, base + lens.get(i - 1) + lens.get(i + 1));
            }
        }

        return ans;
    }
}