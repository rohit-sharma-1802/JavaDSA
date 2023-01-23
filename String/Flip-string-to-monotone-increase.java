// A binary string is monotone increasing if it consists of some number of 0's (possibly none), followed by some number of 1's (also possibly none).

// You are given a binary string s. You can flip s[i] changing it from 0 to 1 or from 1 to 0.

// Return the minimum number of flips to make s monotone increasing.

// Example 1:

// Input: s = "00110"
// Output: 1
// Explanation: We flip the last digit to get 00111.

class Solution {
    public int minFlipsMonoIncr(String s) {
        char charArray[] = new char[s.length()];
        charArray = s.toCharArray();
        int count1 = 0, count2 = 0;
        for(char c: charArray){
            if(c == '0')
                count1++;
            else
                count2++;
            count1 = Math.min(count1,count2);
        
        }
        return count1;
    }
}
