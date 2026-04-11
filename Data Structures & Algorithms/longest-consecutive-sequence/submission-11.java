class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
           return 0;
        int max=1;
        Arrays.sort(nums);
        int count=1;
        for(int i=1;i<nums.length;i++){
            System.out.println("nums: "+nums[i]);
           
            if(nums[i-1]==nums[i]){
               continue; 
            
            }else if(nums[i-1]+1==nums[i]){
            count++;
               
            }
            else{
                count=1;
            
            }
            max=Math.max(max,count);

        }
        return max;
    }
}
