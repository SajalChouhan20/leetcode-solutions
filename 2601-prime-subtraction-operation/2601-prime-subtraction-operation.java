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

    static boolean isPrime(int num) {
        if (num < 2) return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public boolean primeSubOperation(int[] nums) {
        int prev = 0;

        for (int i = 0; i < nums.length; i++) {

            int best = nums[i];

            for (int p = 2; p < nums[i]; p++) {
                if (isPrime(p)) {
                    int val = nums[i] - p;
                    if (val > prev && val < best) {
                        best = val;
                    }
                }
            }
            if (best <= prev) {
                return false;
            }

            prev = best;
        }

        return true;
    }
}