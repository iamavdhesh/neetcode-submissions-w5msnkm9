class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
           return 0;
        int max=1;
        Arrays.sort(nums);
        int count=1;
        for(int i=0;i<nums.length;i++){
            System.out.println("nums: "+nums[i]);
            int diff=0;
            if((i+1)!=nums.length)
              diff=nums[i+1]-nums[i];

            if(diff==1){
                count++;
                
            
            }else if(diff==0){
            continue;
            }
            else{
                count=1;
            
            }
            max=Math.max(max,count);

        }
        return max;
    }
}
