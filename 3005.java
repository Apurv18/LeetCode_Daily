class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        }
        int cur_max = 0;
        for (int val : map.values()) {
            cur_max = Math.max(cur_max, val);
        }

        int res = 0;
        for (int val : map.values()) {
            if (val == cur_max) {
                res += val;
            }
        }

        return res;

    }
}