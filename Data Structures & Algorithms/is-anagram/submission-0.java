class Solution {
    public boolean isAnagram(String s, String t) {
        char[] st1=s.toCharArray();
        char[] st2=t.toCharArray();
        Arrays.sort(st1);
        Arrays.sort(st2);
    
        String res1=new String(st1);
    
        String res2=new String(st2);
        return res1.equals(res2);
    }
}
