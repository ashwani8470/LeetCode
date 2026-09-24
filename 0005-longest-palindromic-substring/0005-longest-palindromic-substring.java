class Solution {
    private int palendrome(String a){
        int n1=a.length();
        int i=0;
        int j=n1-1;
        while(i<j){
            if(a.charAt(i)==a.charAt(j)){
                i++;
                j--;
                continue;
            }
            else{
                return -1;
            }
        }
        return 1;
    }
    public String longestPalindrome(String s) {
        int n=s.length();

        String a="";
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String s1=s.substring(i,j+1);
                int ans=palendrome(s1);
                if(ans == 1 && s1.length() > a.length()){
                  a = s1;
                }
            }
        }
        return a;

    }
}