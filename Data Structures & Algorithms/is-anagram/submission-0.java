class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length())return false;

        HashMap<Character,Integer> Smap = new HashMap<>();

        for(char c : s.toCharArray()){
            Smap.put(c,Smap.getOrDefault(c,0)+1);
        }

        for(char c : t.toCharArray()){
            if(!Smap.containsKey(c)|| Smap.get(c)==0)return false;

            Smap.put(c,Smap.get(c)-1);
        }

        return true;
    }
}
