package edu.northeastern.fxmy;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    private static int question1(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int i:nums){
            map.put(i,1+map.getOrDefault(i,0));
            if(map.get(i) ==1)
                count+=i;
            else if(map.get(i)==2)
                count-=i;
        }
        return count;
    }

    private static int[] question2(int[] nums) {
        int[] res = new int[nums.length];
        int low = 0;
        int high = nums.length-1;
        for(int i = nums.length-1;i>=0;i--){
            if(Math.abs(nums[low])>Math.abs(nums[high])){
                res[i] = nums[low] * nums[low];
                low++;
            }else{
                res[i] = nums[high] * nums[high];
                high--;
            }
        }
        return res;
    }

    private static int question3(int[] nums){
        Map<Integer,Integer> map = new HashMap<>();
        int res = 0;
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:nums){
            if(map.get(i)==1){
                res = i;
                break;
            }
        }
        return res;
    }

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

    private static boolean question5(String str){
        if(str.length()<=1)
            return true;
        boolean isNumber;
        if(str.charAt(0)<=57&&str.charAt(0)>=48)
            isNumber = true;
        else
            isNumber = false;

        for(int i = 1;i<str.length();i++){
            if(str.charAt(i)<=57&&str.charAt(i)>=48&&!isNumber)
                isNumber = true;
            else if ((str.charAt(i)>57||str.charAt(i)<48)&&isNumber)
                isNumber = false;
            else
                return false;
        }
        return true;
    }
}
