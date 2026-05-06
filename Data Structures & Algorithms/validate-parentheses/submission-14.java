class Solution {
    public boolean isValid(String s) {
        Stack<Character> parentheses=new Stack<>();
      
        if(s.length()<2){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' ||ch =='{' ||ch =='['){
                parentheses.push(ch);
            }else if(!parentheses.isEmpty()){
                char popItem=parentheses.peek();
                
                if(popItem =='(' && ch == ')' ){
                  parentheses.pop();
                }
                else if(popItem=='[' && ch==']'){
                                     parentheses.pop();

                  

                }
                else if(popItem=='{' && ch=='}'){
                                    parentheses.pop();

                }else{
                    return false;
                }
                   
                
                   
                     
            }else{
                    return false;

            }  
                   
                   

        }
        return parentheses.isEmpty();
        

    }
}
