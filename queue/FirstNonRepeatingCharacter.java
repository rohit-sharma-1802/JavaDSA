import java.util.*;

public class FirstNonRepeatingCharacter {
    public static String fnrc(String A) {
        char ans[] = new char[A.length()];
        int freq[] = new int[26];
        Queue<Character> q = new ArrayDeque<>(A.length());
        for (int i = 0; i < A.length(); i++) {
            char c = A.charAt(i);
            q.add(c);
            freq[c - 'a']++;
            ans[i] = '#';
            while (!q.isEmpty()) {
                if (freq[q.peek() - 'a'] == 1) {
                    ans[i] = q.peek();
                    break;
                } else
                    q.remove();
            }
        }
        return new String(ans);
    }

    public static void main(String[] args) {
        System.out.println(fnrc("aaaaaaa"));
    }
}
