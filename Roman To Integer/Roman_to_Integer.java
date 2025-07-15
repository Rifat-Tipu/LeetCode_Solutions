class Solution {
    public int romanToInt(String s) {
             Map<Character, Integer> mp = new HashMap<>();
        mp.put('I', 1);
        mp.put('V', 5);
        mp.put('X', 10);
        mp.put('L', 50);
        mp.put('C', 100);
        mp.put('D', 500);
        mp.put('M', 1000);

        int ans = 0;
        int rem = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentVal = mp.get(s.charAt(i));
            if (currentVal >= rem) {
                ans += currentVal;
            } else {
                ans -= currentVal;
            }
            rem = currentVal;
        }
        return ans;
    }
}
