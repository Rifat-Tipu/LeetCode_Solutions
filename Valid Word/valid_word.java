class Solution {
    public boolean isValid(String word) {
        if (word == null || word.length() < 3) return false;

        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        boolean hasVowel = false;
        boolean hasConsonant = false;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                if (Character.isLetter(ch)) {
                    char lowerCh = Character.toLowerCase(ch);

                    if (vowels.contains(lowerCh)) {
                        hasVowel = true;
                    } 
                    else {
                        hasConsonant = true;
                    }
                }
               
            }
             else {
                return false;
            }
        }

        return hasVowel && hasConsonant;
    }
}
