class Solution {
    public int lengthOfLongestSubstring(String s) {
      int maxLen = 0;
        int left = 0;
        Set<Character> seen = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            while (seen.contains(c)) {
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(c);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;

    }
}
