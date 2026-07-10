class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>> ans=new ArrayList<>();
        if (n < 4) return ans;

        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);

        prime[0] = false;
        prime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }

        for (int x = 2; x <= n / 2; x++) {
            if (prime[x] && prime[n - x]) {
                ans.add(Arrays.asList(x, n - x));
            }
        }

        return ans;
    }
}
