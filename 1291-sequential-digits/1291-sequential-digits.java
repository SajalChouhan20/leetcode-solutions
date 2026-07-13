// class Solution {
//     public boolean increasing_Num(int n){
//         int prev = n % 10;   
//         n /= 10;

//        while (n > 0) {

//            int curr = n % 10;

//            if (curr + 1 != prev) {
//                return false;
//           }

//           prev = curr;
//           n /= 10;
//         }

//       return true;
//     }
//     public List<Integer> sequentialDigits(int low, int high) {
//         List<Integer> res=new ArrayList<>();
//         for(int i=low+1;i<high;i++){
//             if(increasing_Num(i)){
//                 res.add(i);
//             }
//         }
//         return res;
//     }
// }
class Solution{
    public List<Integer> sequentialDigits(int low,int high){
        List<Integer> res=new ArrayList<>();
        String digits="123456789";
        int min=String.valueOf(low).length();
        int max=String.valueOf(high).length();

        for (int len = min; len <= max; len++) {
            for (int i = 0; i + len <= 9; i++) {
                int num = Integer.parseInt(digits.substring(i, i + len));

                if (num >= low && num <= high) {
                    res.add(num);
                }
            }
        }
        return res;
    }
}