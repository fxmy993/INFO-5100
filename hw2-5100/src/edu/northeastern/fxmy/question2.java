package edu.northeastern.fxmy;

public class question2 {

    public static void main(String[] args){
        String[] a = {"practice", "makes", "perfect", "coding", "makes"};
        String[] b = {"practice", "makes", "perfect", "coding", "makes"};
        String word1 = "coding";
        String word2 = "practice";
        String word3 = "makes";
        String word4 = "coding";
        System.out.println(shortestDistance(a,word1,word2));
        System.out.println(shortestDistance(b,word3,word4));

    }
    //Time: O(n) Space:O(1)
    public static int shortestDistance(String[] wordsDict, String word1, String word2) {
        int p1 = -1;
        int p2 = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < wordsDict.length; i++) {
            if (wordsDict[i].equals(word1))
                p1 = i;

            if (wordsDict[i].equals(word2))
                p2 = i;

            if (p1 != -1 && p2 != -1)
                min = Math.min(min, Math.abs(p1 - p2));
        }

        return min;
    }
}
