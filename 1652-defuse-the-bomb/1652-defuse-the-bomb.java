class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int[] nums=new int[n];
        if(k==0){
            Arrays.fill(code,0);
            return code;
        }else if(k>0){
            for(int i=0;i<n;i++){
                int sum=0;
                int j=(i+1)%n;
                int m=k;
                while(m!=0){
                        sum+=code[j];
                        j=(j+1)%n;
                        m--;
                    
                }
                nums[i]=sum;
            }
        }
        else{
            for(int i=0;i<n;i++){
                int sum=0;
                int j=(i-1+n)%n;
                int m= -k;
                while(m!=0){
                    sum+=code[j];
                    j=(j-1+n)%n;
                    m--;
                }
                nums[i]=sum;
            }
        }
        return nums;
    }
}