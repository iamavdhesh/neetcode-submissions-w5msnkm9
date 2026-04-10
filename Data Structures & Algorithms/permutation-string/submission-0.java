
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        HashMap<Character, Integer> s1Freq = new HashMap<>();
        HashMap<Character, Integer> s2Freq = new HashMap<>();
        
        // Build frequency map for s1
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            s1Freq.put(ch, s1Freq.getOrDefault(ch, 0) + 1);
        }
        
        // Use sliding window on s2
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            s2Freq.put(ch, s2Freq.getOrDefault(ch, 0) + 1);
            
            // Remove characters outside the window
            if (i >= s1.length()) {
                char leftChar = s2.charAt(i - s1.length());
                s2Freq.put(leftChar, s2Freq.get(leftChar) - 1);
                if (s2Freq.get(leftChar) == 0) {
                    s2Freq.remove(leftChar);
                }
            }
            
            // Check if current window matches s1 permutation
            if (s1Freq.equals(s2Freq)) {
                return true;
            }
        }
        
        return false;
    }
}
