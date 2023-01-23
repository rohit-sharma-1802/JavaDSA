class Solution {
    public int lengthOfLastWord(String s) {
        char sa[] = new char[s.length()];
        sa = s.toCharArray();
        int count = 0;
        for(int i = s.length()-1; i >= 0; i--){
            if(sa[i] == ' ' && count == 0){
                continue;
            }
            else if(sa[i] == ' ' && count != 0){
                break;
            }
            else{
                count++;
            }
        }
        return count;
    }
}
