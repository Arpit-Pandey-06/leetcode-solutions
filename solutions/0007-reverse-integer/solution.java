class Solution {
    public int reverse(int x) {
        int rev=0,temp=x;
        x=Math.abs(x);
        while(x!=0){
            int lb;
            lb=x%10;
            if(rev>(Integer.MAX_VALUE-lb)/10){
                return 0;
            }
            rev=(rev*10)+lb;
            x=x/10;
        }
        rev=(temp>0)?rev:-rev;
        return rev;
        
    }
}
