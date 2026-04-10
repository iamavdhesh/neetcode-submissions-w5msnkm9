class Solution {
    public boolean hasDuplicate(int[] nums) {
       
       HashSet<Integer> integers=new HashSet<>();
       for(int i=0;i<nums.length;i++){
        if(integers.contains(nums[i]))
           return true;
        integers.add(nums[i]);  
       }
       return false;
    }

}