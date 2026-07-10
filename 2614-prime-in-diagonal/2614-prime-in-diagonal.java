class Solution {
    public boolean isPrime(int n){
        if(n==1){
            return false;
        }
        else if(n<4){
            return true;
        }
        else{
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                   return false;
                }
            }
            return true;
        }
    }
    public int diagonalPrime(int[][] nums) {
        int n = nums.length;
        int maxi = 0;

        for(int i = 0; i < n; i++){
            if(isPrime(nums[i][i])){
                maxi = Math.max(maxi, nums[i][i]);
            }

            if(isPrime(nums[i][n - 1 - i])){
                maxi = Math.max(maxi, nums[i][n - 1 - i]);
            }
        }

        return maxi;
    }
}