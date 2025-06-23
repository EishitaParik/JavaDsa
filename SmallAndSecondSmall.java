class Solution {
    public int[] minAnd2ndMin(int arr[]) {
        if (arr == null || arr.length < 2) {
            return new int[]{-1};
        }

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < first) {
                second = first;
                first = num;
            } else if (num > first && num < second) {
                second = num;
            }
        }

        if (second == Integer.MAX_VALUE) {
            return new int[]{-1};
        }

        return new int[]{first, second};
    }
}
