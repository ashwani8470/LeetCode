
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr = new ArrayList<>();

        if (numRows == 0) {
            return arr;
        }

        arr.add(new ArrayList<>());
        arr.get(0).add(1);

        for (int i = 1; i < numRows; i++) {
            arr.add(new ArrayList<>());

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    arr.get(i).add(1);
                } else {
                    int sum = arr.get(i - 1).get(j)
                             + arr.get(i - 1).get(j - 1);

                    arr.get(i).add(sum);
                }
            }
        }

        return arr;
    }
}
