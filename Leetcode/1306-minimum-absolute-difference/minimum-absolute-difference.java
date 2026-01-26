class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            max = Math.max(num, max);
            min = Math.min(num, min);
        }
        int k = max - min + 1;
        boolean[] count = new boolean[k];
        for (int num : arr) {
            count[num - min] = true;
        }
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            while(!count[j]) j++;
            arr[i] = j++ + min;
        }
        List<List<Integer>> result = new ArrayList<>();
        int dif = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length-1; i++) {
            int curDif = arr[i+1] - arr[i];
            if (curDif < dif) {
                result.clear();
                dif = curDif;
            }
            if (curDif == dif) result.add(Arrays.asList(arr[i], arr[i+1]));
        }
        return result;
    }
}