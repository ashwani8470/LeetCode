class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count = 0;
        int num = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                num++;
            } else {
                count++;

                if (count == k) {
                    return num;
                }

                num++;
                i--;
            }
        }

        // Missing numbers are after the last element
        return arr[arr.length - 1] + (k - count);
    }
}