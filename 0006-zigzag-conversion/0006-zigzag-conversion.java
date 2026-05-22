class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        StringBuilder[] temp=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            temp[i]=new StringBuilder();
        }
        int curr=0;
        boolean down=false;
        for(char c:s.toCharArray()){
            temp[curr].append(c);
            if(curr==0 || curr==numRows-1){
                down=!down;
            }
            if(down){
                curr++;
            }else{
                curr--;
            }
        }
        StringBuilder ans=new StringBuilder();
        for(StringBuilder n:temp){
            ans.append(n);
        }
        return ans.toString();
    }
}