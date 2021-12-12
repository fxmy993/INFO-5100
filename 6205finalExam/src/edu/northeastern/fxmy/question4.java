package edu.northeastern.fxmy;

import java.util.HashMap;

public class question4 {

    public static void main(String[] args) {
        String[] words = {"hello","leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        System.out.println(question4(words,order));
    }

    public static boolean question4(String[] words, String order){
        HashMap<Character,Integer> map = new HashMap<>();
        char[] orders = order.toCharArray();
        for(int i = 0;i<orders.length;i++){
            map.put(orders[i],i);
        }

//        int maxCount = -1;
        for(int i = 1;i<words.length;i++){
            char[] word1 = words[i-1].toCharArray();
            char[] word2 = words[i].toCharArray();

            if(word2.length<word1.length)
                return false;
            int wordMax = Math.min(word1.length,word2.length);
            for(int j = 0;j<word1.length;j++){
                if(map.get(word1[j])>map.get(word2[j])){
                    return false;
                }
            }
        }

        return true;
    }
}

