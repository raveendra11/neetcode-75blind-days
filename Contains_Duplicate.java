package org.example;

class Contains_Duplicate {
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

        Contains_Duplicate object = new Contains_Duplicate();
        System.out.println(object.hasDuplicate(nums));

    }
}
