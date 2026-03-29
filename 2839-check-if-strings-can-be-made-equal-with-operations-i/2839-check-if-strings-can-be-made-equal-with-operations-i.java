class Solution {
    public boolean canBeEqual(String s1, String s2) {
        char[] even1 = new char[2];
        char[] odd1 = new char[2];
        char[] even2 = new char[2];
        char[] odd2 = new char[2];

        even1[0] = s1.charAt(0);
        even1[1] = s1.charAt(2);
        odd1[0] = s1.charAt(1);
        odd1[1] = s1.charAt(3);

        even2[0] = s2.charAt(0);
        even2[1] = s2.charAt(2);
        odd2[0] = s2.charAt(1);
        odd2[1] = s2.charAt(3);

        Arrays.sort(even1);
        Arrays.sort(even2);
        Arrays.sort(odd1);
        Arrays.sort(odd2);

        return Arrays.equals(even1, even2) && Arrays.equals(odd1, odd2);
    }    
}