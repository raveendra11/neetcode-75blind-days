package org.example;

class Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        int index[] = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    index[0] =i;
                    index[1] =j;
                }
            }

        }
        return index;
    }

    public static void main(String[] args) {
        Two_Sum object = new Two_Sum();
        int[] indices = object.twoSum(new int[]{1,2,3,45,5},8);
        for(int i=0;i<indices.length;i++){
            System.out.println(indices[i]);
        }
    }
}
