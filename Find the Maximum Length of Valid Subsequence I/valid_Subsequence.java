class Solution {
    public int maximumLength(int[] nums) {
       
       int odd=0;
       int even=0;

       for(int n: nums)
       {
        if(n%2==1)
        {
            odd++;
        }
        else even++;
       }
       int oddstart=0;
       boolean flag=true;
       for(int n: nums)
       {
        if((n%2==1)==flag)
        {
            oddstart++;
            flag=!flag;
        }
       }

       int evenstart=0;
       boolean flag2=true;

       for(int n: nums)
       {
        if((n%2==0)==flag2)
        {
            evenstart++;
            flag2=!flag2;
        }
       }
       return (Math.max(Math.max(odd,even),Math.max(evenstart,oddstart)));
    }
}
