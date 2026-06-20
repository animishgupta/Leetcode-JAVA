class Solution {
    public boolean isPalindrome(int x) {
        
        int rev=0;
        if(x<0){
            return false;
        }
        int p=x;
        
        while(x>0){
            rev=rev*10+x%10;
            x=x/10;
        }
        return rev==p;
        
    }
}