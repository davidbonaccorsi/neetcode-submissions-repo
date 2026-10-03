class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()){
            return false;
        }

        HashMap<Character,Integer> sMap = new HashMap<Character,Integer>();
        HashMap<Character,Integer> tMap = new HashMap<Character,Integer>();

        for(char c : s.toCharArray()){
            int count = sMap.containsKey(c) ? sMap.get(c) : 0;
            if(count == 0){
                sMap.put(c,1);
            } else {
                sMap.put(c,count+1);
            }
        }

        for(char c : t.toCharArray()){
            int count = tMap.containsKey(c) ? tMap.get(c) : 0;
            if(count == 0){
                tMap.put(c,1);
            } else {
                tMap.put(c,count+1);
            }
        }

        for(char c : sMap.keySet()){
            if(!Objects.equals(sMap.get(c), tMap.get(c))){
                return false;
            }
        }

        return true;
    }
}
