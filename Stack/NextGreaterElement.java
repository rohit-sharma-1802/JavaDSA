package Stack;

import java.util.*;

public class NextGreaterElement {
    public static int[] nextGreater(int[] arr) {
        int res[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[i] >= st.peek()) {
                st.pop();
            }
            res[i] = st.isEmpty() == false ? st.peek() : -1;
            st.push(arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        System.out.println(Arrays.toString(nextGreater(arr)));
    }
}
