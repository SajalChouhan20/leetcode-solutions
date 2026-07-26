class Solution {
    public int splitArray(int[] nums, int k) {
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int c:nums){
            low=Math.max(low,c);
            high+=c;
        }

        while(low<=high){
            int mid=low+(high-low)/2;
            int sum=0,s=1;
            for(int i=0;i<nums.length;i++){
                if(sum+nums[i]>mid){
                    s++;
                    sum=nums[i];
                }else{
                    sum+=nums[i];
                }
            }
            if(s<=k) high=mid-1;
            else low=mid+1;
        }
        return low;
    }
}