class Solution {
    public void gen(int open,int close,String s,List<String> res,int n){
        if(open==n && close==n){
            res.add(s);
            return;
        }
        if(open<n){
            gen(open+1,close,s+"(",res,n);
        }
        if(close<open){
            gen(open,close+1,s+")",res,n);
        }
    } 
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        gen(0,0,"",res,n);
        return res;
        // List<List<String>> dp = new ArrayList<>();

        // dp.add(Arrays.asList(""));

        // for (int i = 1; i <= n; i++) {

        //     List<String> cur = new ArrayList<>();

        //     for (int j = 0; j < i; j++) {

        //         for (String left : dp.get(j)) {

        //             for (String right : dp.get(i - 1 - j)) {

        //                 cur.add("(" + left + ")" + right);

        //             }
        //         }
        //     }

        //     dp.add(cur);
        // }

        // return dp.get(n);
    }
}