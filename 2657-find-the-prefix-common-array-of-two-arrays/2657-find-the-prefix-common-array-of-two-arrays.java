class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
       Set<Integer> A1=new HashSet<>();
       Set<Integer> B1=new HashSet<>();
       int n=A.length;
       int count=0;
       int res[]=new int[n];
       for(int i=0;i<n;i++){
        A1.add(A[i]);
        if(A1.contains(B[i])){
            count++;
        }
        B1.add(B[i]);
        if(A[i]!=B[i] && B1.contains(A[i])){
            count++;
        }
        res[i]=count;
       }
       return res;
    }
}