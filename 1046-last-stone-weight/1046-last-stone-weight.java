
class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq =
            new PriorityQueue<>(Collections.reverseOrder());

        for (int stone : stones) {
            pq.add(stone);
        }

        while (pq.size() >= 2) {

            int h1 = pq.poll();
            int h2 = pq.poll();

            if (h1 != h2) {
                pq.add(h1 - h2);
            }
        }

        return pq.isEmpty() ? 0 : pq.poll();
    }
}
