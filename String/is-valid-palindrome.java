// Given a string s, return true if the s can be palindrome after deleting at most one character from it.

 

// Example 1:

// Input: s = "aba"
// Output: true
// Example 2:

// Input: s = "abca"
// Output: true
// Explanation: You could delete the character 'c'.
// Example 3:

// Input: s = "abc"
// Output: false

class Solution {
    private boolean isValidPalindrome(String s, int left, int right){
        while(left < right)
            if(s.charAt(left++) != s.charAt(right--))
                return false;
        return true;
    }
    public boolean validPalindrome(String s) {
       for(int left = 0, right = s.length()-1; left < right; left++, right--)
           if(s.charAt(left) != s.charAt(right))
                return isValidPalindrome(s, left+1, right) || isValidPalindrome(s, left, right-1);
        return true;
    }
}
