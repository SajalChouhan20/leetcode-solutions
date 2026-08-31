class Solution {
    public int minArrivalsToDiscard(int[] arrivals, int w, int m) {
        int n=arrivals.length;
        int[] freq=new int[100001];
        boolean[] kept=new boolean[n];
        int dis=0;
        for(int i=0;i<n;i++){
            if(i>=w){
                if(kept[i-w]){
                    freq[arrivals[i-w]]--;
                }
            }
            int curr=arrivals[i];
            if(freq[curr]<m){
                kept[i]=true;
                freq[curr]++;
            }else{
                kept[i]=false;
                dis++;
            }
        }
        return dis;
    }
}