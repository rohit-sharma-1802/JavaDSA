package Questions;

import java.util.*;

public class CountSubStringOddOccurence {
    public static boolean hasOddOccurence(int[] freq) {
        for (int f : freq) {
            if (f % 2 != 0)
                return true;
        }
        return false;
    }

    public static int getNumOddSubString(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            int freq[] = new int[26];
            for (int j = i; j < str.length(); j++) {
                freq[str.charAt(j) - 'a']++;
                if (hasOddOccurence(freq)) {
                    count++;
                }
            }
        }
        // Map<Character, Integer> map = new HashMap<>();
        // int oddOcc = 0;
        // for (int i = 0; i < str.length(); i++) {
        // char c = str.charAt(i);
        // map.put(c, map.getOrDefault(map, 0) + 1);
        // if (map.get(c) % 2 == 0)
        // oddOcc--;
        // else
        // oddOcc++;
        // if (oddOcc > 0)
        // count += oddOcc;
        // }

        return count;
    }

    public static void main(String[] args) {
        String str = "xxyy";
        System.out.println(getNumOddSubString(str));
    }
}
