class Solution {
    public int firstUniqChar(String s) {
        
        int count[] = new int[255];
        int rep = 0;
        char[] str = new char[s.length()];

        for(int i = 0; i < s.length(); i++){
            int c = (int)s.charAt(i);
            count[c] += 1;
        }

        for(int i = 0; i < s.length(); i++){
            int c = (int)s.charAt(i);
            if(count[c] == 1)
                return i;
        }
            return -1;
    }
}
