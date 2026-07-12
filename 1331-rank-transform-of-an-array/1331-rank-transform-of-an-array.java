class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] temp = arr.clone();
        Arrays.sort(temp);

        Map<Integer, Integer> res = new HashMap<>();

        for (int i = 0; i < temp.length; i++) {
            if (!res.containsKey(temp[i])) {
                res.put(temp[i], res.size() + 1);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = res.get(arr[i]);
        }

        return arr;
    }
}