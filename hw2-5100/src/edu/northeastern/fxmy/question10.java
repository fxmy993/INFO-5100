package edu.northeastern.fxmy;

public class question10 {

    public static void main(String[] args){
        char[] chars1 = {'a','a','b','b','c','c','c'};
        char[] chars2 = {'a'};
        System.out.println(compress(chars1));
        System.out.println(compress(chars2));

    }
//Time: O(n) Space: O(1)
    public static int compress(char[] chars) {
        int p1 = 0, p2 = 0;
        while(p2 < chars.length){
            char currentChar = chars[p2];
            int count = 0;
            while(p2 < chars.length && chars[p2] == currentChar){
                p2++;
                count++;
            }
            chars[p1++] = currentChar;
            if(count != 1)
                for(char num : Integer.toString(count).toCharArray())
                    chars[p1++] = num;
        }
        return p1;
    }
}
