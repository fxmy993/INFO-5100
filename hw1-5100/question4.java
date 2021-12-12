package edu.northeastern.fxmy;

public class question4 {
    public static void main(String[] args) {
        // write your code here
        String ransomNote = "a", magazine = "b";
        String ransomNote1 = "aa", magazine1 = "aab";
        boolean res = question4(ransomNote,magazine);
        boolean res1 = question4(ransomNote1,magazine1);
        System.out.println(res);
        System.out.println(res1);
    }

    //Time: O(m+n) Space: O(1)
    private static boolean question4(String ransomNote, String magazine) {
        int[] arr = new int[128];

        for(int i = 0 ; i < ransomNote.length(); i ++){
            arr[ransomNote.charAt(i)] --;
        }

        for(int i = 0;i<magazine.length();i++){
            arr[magazine.charAt(i)] ++;
        }

        for(int i = 0 ; i < 128; i ++){
            if(arr[i] < 0){
                return false;
            }
        }
        return  true;
    }
}
