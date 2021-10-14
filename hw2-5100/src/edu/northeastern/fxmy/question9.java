package edu.northeastern.fxmy;

public class question9 {

    public static void main(String[] args){
        String word1 = "the sky is blue";
        String word2 = "  hello world  ";
        System.out.println(reverseWords(word1));
        System.out.println(reverseWords(word2));

    }

    //Time: O(n^2) Space: O(n)
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int i = n - 1;
        while(i >= 0) {
            if (s.charAt(i) == ' ') {
                i--;
                continue;
            }
            int j = i - 1;
            while(j >= 0 && s.charAt(j) != ' ') j--;
            sb.append(" ");
            sb.append(s.substring(j + 1, i + 1));
            i = j - 1;
        }
        if (sb.length() > 0) sb.deleteCharAt(0);
        return sb.toString();
    }
}
