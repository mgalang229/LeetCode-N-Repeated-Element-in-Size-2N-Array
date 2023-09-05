class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length;
        int repeat = n / 2;
        Arrays.sort(nums);
        int ans = -1;
        for (int i = 0; i < n; i++) {
            int index = i;
            while (index < n && nums[index] == nums[i]) {
                index++;
            }
            if (index - i == repeat) {
                ans = nums[i];
                break;
            }
            i = index - 1;
        }
        return ans;
    }
}
