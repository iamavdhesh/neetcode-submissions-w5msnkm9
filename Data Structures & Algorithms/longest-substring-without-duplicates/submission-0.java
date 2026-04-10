// 1. check the frequncy of each char
// 2. set for duplicate item checks
// 3. check longest substring till the string length
// 4.  return max  count of that string

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int max=0;
         HashSet<Character> charitems=new HashSet<>();

        for(int right=0;right<s.length();right++){
            char ch= s.charAt(right);

           while(charitems.contains(ch))
           {
            charitems.remove(s.charAt(left));
            left++;
           }    

        charitems.add(ch);
        max=Math.max(max,right-left+1);
        }

        
    return max;

    }
}
