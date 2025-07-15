/* Suffix product and Prefix product concept */

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n=nums.length;

        int[] sufix=new int[n];
        int[] prefix=new int[n];
        int[] ans=new int[n];
        sufix[n-1]= nums[n-1];
        prefix[0]=nums[0];
        int j=n-2;
        for(int i=1;i<n;i++)
        {
            prefix[i]=prefix[i-1]*nums[i];
            sufix[j]=sufix[j+1]*nums[j];
            j--;
        }
        ans[0]=sufix[1];
        ans[n-1]=prefix[n-2];
        for(int i=1;i<=n-2;i++)
        {
            ans[i]=prefix[i-1]*sufix[i+1];
        }
        return ans;
    }
}
