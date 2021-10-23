import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        List<String> l;

        for(int i = 0; i < strs.length; i ++){
            l = new ArrayList<>();
            l.add(strs[i]);

            for(int j = i+1; j < strs.length; j++){
                if(isAnagram(strs[i],strs[j])){
                    l.add(strs[j]);
                    strs[j] = "0";
                }
            }
            if(!l.contains("0")){
                list.add(l);
            }

        }return list;
    }

    public boolean isAnagram(String s, String t) {
        boolean isAnagram = false;
        ArrayList<Character> a = new ArrayList<>();

        if(Objects.equals(s, t)){
            return true;
        }
        if(s.length() != t.length()){
            return false;
        }

        for(int i = 0; i < t.length(); i++) {
            a.add(s.charAt(i));
        }
        for(int i = 0; i < t.length(); i++){
            int index = a.indexOf(t.charAt(i));
            if(index != -1){
                a.remove(index);
                isAnagram = true;
            }else{
                return false;
            }
        }
        return isAnagram;
    }
}