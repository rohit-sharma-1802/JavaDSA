package Recursion;

public class RemoveDuplicateFromString {
    public static void remove(String str, int i, StringBuilder res, boolean hash[]) {
        if (i == str.length())
            return;
        if (!hash[str.charAt(i) - 'a']) {
            res.append(str.charAt(i));
            hash[str.charAt(i) - 'a'] = true;
        }
        remove(str, i + 1, res, hash);
    }

    public static String removeDuplicate(String str) {
        StringBuilder res = new StringBuilder();
        boolean hash[] = new boolean[26];
        // for (int i = 0; i < str.length(); i++) {
        // char c = str.charAt(i);
        // if (hash[c - 'a'] == false) {
        // res.append(c);
        // hash[c - 'a'] = true;
        // }
        // }
        // return res.toString();
        remove(str, 0, res, hash);
        return res.toString();
    }

    public static void main(String[] args) {
        String str = "rohitsharma";
        System.out.println(removeDuplicate(str));
    }
}
