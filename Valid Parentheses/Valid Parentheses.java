class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        int cnt=0;

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
            {
                st.push(s.charAt(i));
            }
            else
            {
                cnt++;
                if(!st.isEmpty())
                {
                    if((s.charAt(i)==')'&& st.peek()=='(') || (s.charAt(i)=='}'&& st.peek()=='{') || (s.charAt(i)==']'&& st.peek()=='['))
                    {
                        st.pop();
                        cnt--;
                    }
                    else
                    {
                        cnt=0;
                        break;
                    }
                }
            }
        }
        if(st.size()>=1 || cnt>=1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
