package edu.northeastern.fxmy;

public class question7 {

    public static void main(String[] args){
        String word1 = "11";
        String word2 = "123";
        String word3 = "456";
        String word4 = "77";
        System.out.println(addStrings(word1,word2));
        System.out.println(addStrings(word3,word4));

    }

//Time: O(m+n) Space: O(m+n)
    public static String addStrings(String num1, String num2) {
        int m = num1.length() - 1;
        int n = num2.length() - 1;
        int plus = 0;
        char[] num1Array = num1.toCharArray();
        char[] num2Array = num2.toCharArray();
        StringBuilder res = new StringBuilder();
        while (m >= 0 || n >= 0 || plus == 1) {
            int a = m >= 0 ? (num1Array[m--] - '0') : 0;
            int b = n >= 0 ? (num2Array[n--] - '0') : 0;
            int sum = a + b + plus;
            res.insert(0, sum % 10);
            plus = sum / 10;
        }
        return res.toString();
    }
}
