class Solution {
    public boolean checkStrings(String s1, String s2) {
        // int[] even1 = new int[26];
        // int[] odd1 = new int[26];
        // int[] even2 = new int[26];
        // int[] odd2 = new int[26];

        // for (int i = 0; i < s1.length(); i++) {
        //     char c1 = s1.charAt(i);
        //     char c2 = s2.charAt(i);

        //     if (i % 2 == 0) {
        //         even1[c1 - 'a']++;
        //         even2[c2 - 'a']++;
        //     } else {
        //         odd1[c1 - 'a']++;
        //         odd2[c2 - 'a']++;
        //     }
        // }

        // for (int i = 0; i < 26; i++) {
        //     if (even1[i] != even2[i] || odd1[i] != odd2[i]) {
        //         return false;
        //     }
        // }

        // return true;
        // Map<Character, Integer> even1 = new HashMap<>();
        // Map<Character, Integer> odd1 = new HashMap<>();
        // Map<Character, Integer> even2 = new HashMap<>();
        // Map<Character, Integer> odd2 = new HashMap<>();

        // for (int i = 0; i < s1.length(); i++) {
        //     char c1 = s1.charAt(i);
        //     char c2 = s2.charAt(i);

        //     if (i % 2 == 0) {
        //         even1.put(c1, even1.getOrDefault(c1, 0) + 1);
        //         even2.put(c2, even2.getOrDefault(c2, 0) + 1);
        //     } else {
        //         odd1.put(c1, odd1.getOrDefault(c1, 0) + 1);
        //         odd2.put(c2, odd2.getOrDefault(c2, 0) + 1);
        //     }
        // }

        // return even1.equals(even2) && odd1.equals(odd2);
        int[] even = new int[26];
        int[] odd = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            if ((i & 1) == 0) {
                even[s1.charAt(i) - 'a']++;
                even[s2.charAt(i) - 'a']--;
            } else {
                odd[s1.charAt(i) - 'a']++;
                odd[s2.charAt(i) - 'a']--;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (even[i] != 0 || odd[i] != 0) return false;
        }

        return true;

    }
}