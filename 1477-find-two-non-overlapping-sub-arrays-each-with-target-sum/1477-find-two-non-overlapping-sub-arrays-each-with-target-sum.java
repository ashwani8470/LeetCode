class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int INF = n + 1;

        int[] best = new int[n];
        Arrays.fill(best, INF);

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int prefix = 0;
        int ans = INF;

        for (int i = 0; i < n; i++) {
            prefix += arr[i];

            // Carry forward the best subarray found so far
            if (i > 0) {
                best[i] = best[i - 1];
            }

            // Check if a subarray ending at i has sum = target
            if (map.containsKey(prefix - target)) {
                int j = map.get(prefix - target);
                int len = i - j;

                // Previous subarray must end before j
                if (j >= 0 && best[j] != INF) {
                    ans = Math.min(ans, len + best[j]);
                }

                // This becomes the best subarray ending at/before i
                best[i] = Math.min(best[i], len);
            }

            map.put(prefix, i);
        }

        return ans == INF ? -1 : ans;
    }
}