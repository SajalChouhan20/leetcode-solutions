class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> ht=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int key=target-nums[i];
            if(ht.containsKey(key)){
                return new int[] {ht.get(key),i};
            }
            else{
                ht.put(nums[i],i);
            }
        }
        return null;
    }
}
