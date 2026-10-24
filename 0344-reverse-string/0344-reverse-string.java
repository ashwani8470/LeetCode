class Solution {
    public void reverseString(char[] s) {
     //Approach 1 beats beats 28.59
       /*int n= s.length;  
     int i=0;
       int j=n-1;
       while(i<j){
        char temp=s[i];
        s[i]=s[j];
        s[j]=temp;
        i++;
        j--;
       }
       */

       //Approach 2
       
     
        String ch = new String(s);
        StringBuilder sb = new StringBuilder(ch);
        sb.reverse();

        for (int i = 0; i < s.length; i++) {
            s[i] = sb.charAt(i);
        }
    

    }
}