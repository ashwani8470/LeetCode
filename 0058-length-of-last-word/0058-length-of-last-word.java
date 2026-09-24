class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int count = 0;
        int i;

        for (i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                continue;
            } else {
                break;
            }
        }

        for (int j = i; j >= 0; j--) {
            if (s.charAt(j) != ' ') {
                count++;
            } else {
                break;
            }
        }

        return count;
    }
}