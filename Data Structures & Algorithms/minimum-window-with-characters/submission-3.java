class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();

        if(n<t.length())
        return "";

        HashMap<Character,Integer> map = new HashMap<>();
        int countR = t.length();
        int minlen = Integer.MAX_VALUE;

        int start_i =0;
        int i =0;

        for(char c : t.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(int j =0;j<n;j++){
            char c = s.charAt(j);

            if(map.getOrDefault(c,0)>0){
                countR--;
            }
            map.put(c,map.getOrDefault(c,0)-1);

            while(countR == 0){
                int windowSize = j-i+1;

                if(windowSize<minlen){
                    minlen= windowSize;
                    start_i = i;

                }

                //Start shriking logic
                char ci = s.charAt(i);
                map.put(ci,map.get(ci)+1);
                if(map.get(ci)>0){
                    countR++;
                } 
                i++;
            }
        }
        return minlen == Integer.MAX_VALUE?"":s.substring(start_i,start_i+minlen);
        
    }
}
