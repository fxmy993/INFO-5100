package edu.northeastern.fxmy;

import java.util.HashMap;

public class question6 {

    public static void main(String[] args){
        String word1 = "egg";
        String word2 = "add";
        String word3 = "foo";
        String word4 = "bar";
        System.out.println(isIsomorphic(word1,word2));
        System.out.println(isIsomorphic(word3,word4));

    }

    //Time: O(n) Space: O(1)
    public static boolean isIsomorphic(String s, String t) {
        if(s == null || s.length() <= 1)
            return true;
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        for(int i = 0 ; i< s.length(); i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(map.containsKey(a)){
                if(!map.get(a).equals(b))
                    return false;
            }else{
                if(!map.containsValue(b))
                    map.put(a,b);
                else
                    return false;
            }
        }
        return true;
    }
}
