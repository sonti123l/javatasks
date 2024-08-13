class Solution {
    public boolean isSubsequence(String s, String t) {
        // Create a HashMap to store the indices of characters in the string t
        HashMap<Character, Integer> subFreq = new HashMap<>();
        
        // Initialize a pointer to track the current position in string t
        int currentPos = 0;

        // Loop through each character in the string s
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            
            // Find the index of the current character in t starting from currentPos
            int foundPos = t.indexOf(currentChar, currentPos);
            
            // If the character is not found, return false
            if (foundPos == -1) {
                return false;
            }
            
            // Update the current position in t to be just after the found character
            currentPos = foundPos + 1;
            
            // Store the position of the character in the HashMap
            subFreq.put(currentChar, foundPos);
        }

        return true; // If all characters in s are found in the correct order, return true
    }
}
