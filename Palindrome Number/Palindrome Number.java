class Solution {
    public boolean isPalindrome(int x) {
        if(x==0) return true;

        if(x<0 || (x>=0 && x%10==0))
        {
            return false;
        }

         // long keep=x;

        long store=0;

        while(x>store)
        {

           // int res=x%10;
            store=(store*10)+x%10;
            x/=10;
        }
        return(x==store || x==store/10);
        
    }
}
