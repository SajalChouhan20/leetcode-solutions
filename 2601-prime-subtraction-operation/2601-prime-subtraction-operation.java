// class Solution {
//     public boolean isSorted(int[] arr){
//         for (int i = 1; i < arr.length; i++) {
//         if (arr[i] <= arr[i - 1]) {
//             return false;
//         }
//     }
//     return true;
//     }
//     static boolean isPrime(int num) {
//         if (num < 2) return false;

//         for (int i = 2; i * i <= num; i++) {
//             if (num % i == 0)
//                 return false;
//         }
//         return true;
//     }

//     static int largestPrime(int n) {
//         for (int i = n; i >= 2; i--) {
//             if (isPrime(i) && i!=n)
//                 return i;
//         }
//         return -1; 
//     }
//     public boolean primeSubOperation(int[] nums) {
//         if(isSorted(nums)){
//             return true;
//         }else{
//             int n=nums.length;
//             for(int i=0;i<n;i++){
//                 int prime=largestPrime(nums[i]);
//                 int val=nums[i]-prime;
//                 nums[i]=val;
//                 if(isSorted(nums)){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }
class Solution {

    public boolean primeSubOperation(int[] nums) {

        boolean[] isPrime = new boolean[1001];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= 1000; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= 1000; j += i)
                    isPrime[j] = false;
            }
        }

        int prev = 0;

        for (int i = 0; i < nums.length; i++) {

            int prime = 0;

            for (int p = 2; p < nums[i]; p++) {
                if (isPrime[p] && nums[i] - p > prev) {
                    prime = p;     
                }
            }

            nums[i] -= prime;

            if (nums[i] <= prev)
                return false;

            prev = nums[i];
        }

        return true;
    }
}