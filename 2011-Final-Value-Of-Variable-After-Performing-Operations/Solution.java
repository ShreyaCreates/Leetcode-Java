class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (int i = 0; i < operations.length; i++) {
            String currentOp = operations[i];
            if (currentOp.charAt(1) == '+') {
                x++;
            } else {
                x--;
            }
        }
        return x;
    }
}
