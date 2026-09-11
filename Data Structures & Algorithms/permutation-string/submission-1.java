class Solution {
    public boolean checkInclusion(String s1, String s2) {
       int [] arr_s1 = new int [26];
       int [] arr_s2 = new int [26];

       if(s1.length()>s2.length())
            return false;

       int n = s1.length();

       for(char c : s1.toCharArray()){
             arr_s1[c-'a']++;
       }
       int i =0;

       for(int j=0;j<n;j++ ){
          arr_s2[s2.charAt(j)-'a']++;

       }

       if(Arrays.equals(arr_s1,arr_s2)){
            return true;
       }

       for(int j=n;j<s2.length();j++ ){
          arr_s2[s2.charAt(j)-'a']++;
           arr_s2[s2.charAt(i)-'a']--;
           i++;

           if(Arrays.equals(arr_s1,arr_s2)){
            return true;
             }

       }
       return false;
       
        
    }
}
