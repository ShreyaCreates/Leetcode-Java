class Solution {
    public String restoreString(String s, int[] indices) {
        char[] board = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int targetIndex = indices[i];
            board[targetIndex] = s.charAt(i);
        }
        return new String(board);
    }
}
