package edu.northeastern.fxmy;

public class question8 {

    public static void main(String[] args){
        String word1 = "A man, a plan, a canal: Panama";
        String word2 = "race a car";
        System.out.println(isPalindrome(word1));
        System.out.println(isPalindrome(word2));

    }

    //Time: O(n) Space: O(1)
    public static boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int low = 0, high = s.length() - 1;
        char clow, chigh;
        while(low <= high) {
            clow = s.charAt(low);
            chigh = s.charAt(high);
            if (!Character.isLetterOrDigit(clow)) {
                low++;
            } else if(!Character.isLetterOrDigit(chigh)) {
                high--;
            } else {
                if (Character.toLowerCase(clow) != Character.toLowerCase(chigh)) {
                    return false;
                }
                low++;
                high--;
            }
        }
        return true;
    }
}
