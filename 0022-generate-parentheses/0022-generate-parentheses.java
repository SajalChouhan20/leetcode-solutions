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
    }
}