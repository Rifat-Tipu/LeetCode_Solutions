class Solution {
    public int reverse(int x) {
        long sum = 0;
        int hold = x; 
        x = Math.abs(x); 

        while (x > 0) {
            long res = x % 10;
            sum = sum * 10 + res;
            x /= 10;
        }

        
        if (sum < Integer.MIN_VALUE || sum > Integer.MAX_VALUE) {
            return 0;
        }

        
        if (hold < 0) {
            sum *= -1;
        }

        return (int) sum;
    }
}
