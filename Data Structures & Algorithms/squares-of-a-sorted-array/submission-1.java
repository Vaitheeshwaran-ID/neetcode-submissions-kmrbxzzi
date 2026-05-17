class Solution {
    public int[] sortedSquares(int[] nums) {

        int num[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            num[i]=Math.abs(nums[i]*nums[i]);
        }
                Arrays.sort(num);
        return num;
    }
}