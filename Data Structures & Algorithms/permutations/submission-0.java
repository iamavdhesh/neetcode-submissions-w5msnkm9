class Solution {
    
    
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>> records=new ArrayList();
       List<Integer> current=new ArrayList<Integer>();

       boolean [] used=new boolean[nums.length];
       
      backTrack(nums,current,used,records);

    return records;
    }

    
    public void backTrack(int[] nums,List<Integer> current,boolean used[],List<List<Integer>> records){
          if (current.size() == nums.length) {
           records.add(new ArrayList<>(current)); 
           return;
        }
        for (int i=0;i<nums.length;i++){
            if(used[i]){
                continue;
            }
            used[i]=true;

            current.add(nums[i]);

            backTrack(nums,current,used,records);
            current.remove(current.size()-1);
            used[i]=false;

        }

    }
    
}
