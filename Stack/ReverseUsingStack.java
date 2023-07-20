package Stack;

import java.util.*;

public class ReverseUsingStack {
    public static String reverse(String str) {
        Stack<Character> st = new Stack<>();
        StringBuilder rev = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            st.push(str.charAt(i));
        }
        while (!st.isEmpty()) {
            rev.append(st.pop());
        }

        return new String(rev);
    }

    public static void main(String[] args) {
        String str = new String("Hello World");
        System.out.println(reverse(str));
    }
}
