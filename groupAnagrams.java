public class groupAnagrams{
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new ArrayList<List<String>>();
        Arrays.sort(strs);
        HashMap<String,List<String>> map=new HashMap<String,List<String>>();
        for(String str:strs){
            char[] arrStr=str.toCharArray();
            Arrays.sort(arrStr);
            String tempStr=new String(arrStr);
            if(map.containsKey(tempStr)){
                map.get(tempStr).add(str);
            }else{
                List<String> temp=new ArrayList<String>();
                temp.add(str);
                map.put(tempStr,temp);
            }
        }
        for(List<String> list:map.values()){
            res.add(list);
        }
        return res;
    }
}