// class Solution {
//     public List<Integer> findDuplicates(int[] nums) {
//         Map<Integer,Integer> temp=new HashMap<>();
//         for(int n:nums){
//             temp.put(n,temp.getOrDefault(n,0)+1);
//         }
//         List<Integer> res=new ArrayList<>();
//         for (Map.Entry<Integer, Integer> entry : temp.entrySet()) {
//             if (entry.getValue() >= 2) {
//                 res.add(entry.getKey());
//             }
//         }
//         return res;
//     }
// }
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;

            if (nums[index] < 0) {
                res.add(index + 1);
            } else {
                nums[index] = -nums[index];
            }
        }

        return res;
    }
}
