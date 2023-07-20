package Stack;

import java.util.*;
import java.util.Map;

public class StockSpanProblem {
    public static int[] stocksSpan(int[] stocks) {
        Stack<Integer> st = new Stack<>();
        int[] span = new int[stocks.length];
        span[0] = 1;
        st.push(0);
        for (int i = 1; i < stocks.length; i++) {
            while (!st.isEmpty() && stocks[i] > stocks[st.peek()]) {
                st.pop();
            }
            span[i] = st.isEmpty() == true ? i + 1 : i - st.peek();
            st.push(i);
        }
        return span;
    }

    public static void main(String[] args) {
        int stocks[] = { 100, 80, 60, 70, 60, 75, 85 };
        int[] ans = stocksSpan(stocks);
        System.out.println(Arrays.toString(ans));
    }

}
