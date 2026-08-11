class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer> temp=new HashSet<>();
        for(int n:nums){
            temp.add(n);
        }
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                sum+=nums[i];
            }else{
                break;
            }
        }
        while(temp.contains(sum)){
            sum++;
        }
        return sum;
    }
}