class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] isAllowed = new boolean[26];
        
        // Populate our lookup table
        for (int i = 0; i < allowed.length(); i++) {
            isAllowed[allowed.charAt(i) - 'a'] = true;
        }
        
        int consistentCount = 0;
        
        // Verify each word
        for (String word : words) {
            boolean isConsistent = true;
            
            for (int i = 0; i < word.length(); i++) {
                // If this character index maps to false, the word is broken
                if (!isAllowed[word.charAt(i) - 'a']) {
                    isConsistent = false;
                    break; 
                }
            }
            
            if (isConsistent) {
                consistentCount++;
            }
        }
        
        return consistentCount;
    }
}
