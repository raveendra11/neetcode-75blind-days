package org.example;

class Solution1 {
    public boolean hasDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        Solution1 object = new Solution1();
        System.out.println(object.hasDuplicate(nums));

    }
}
