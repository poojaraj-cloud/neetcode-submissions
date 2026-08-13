class Solution {

    public String encode(List<String> strs) {
        StringBuffer res = new StringBuffer();

        for(String s: strs){
            res.append(s.length());
            res.append('#');
            res.append(s);
        }
        return res.toString();

    }
    //5#HEllo4#World

    public List<String> decode(String str) {

        List<String> list = new ArrayList<>();

        int i =0;

        while(i<str.length()){
            int j =i;
            while(str.charAt(j)!='#'){
                j++;
            }

            int len = Integer.parseInt(str.substring(i,j));
            j++;

            String res = str.substring(j,j+len);
            list.add(res);
            i=j+len;

        }


        return list;

    }
}
