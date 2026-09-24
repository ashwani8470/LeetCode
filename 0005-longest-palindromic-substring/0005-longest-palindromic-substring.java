
    //Approach 1 5%
    /*
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
}*/

//Approach 2
class Solution {

    private int expand(String s, int left, int right) {

        while (left >= 0 && right < s.length()
                && s.charAt(left) == s.charAt(right)) {

            left--;
            right++;
        }

        return right - left - 1;
    }

    public String longestPalindrome(String s) {

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {

            int len1 = expand(s, i, i);
            int len2 = expand(s, i, i + 1);

            int len = Math.max(len1, len2);

            if (len > end - start + 1) {

                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }
}