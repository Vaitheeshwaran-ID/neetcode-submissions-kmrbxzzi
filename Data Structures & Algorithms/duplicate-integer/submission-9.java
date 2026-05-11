class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean s=false;
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
if(nums[i]==nums[j]){
count++;
}}
        }
         s=(count>0)?true:false;
    return s;}
}