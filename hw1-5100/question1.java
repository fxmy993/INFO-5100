package edu.northeastern.fxmy;

import java.util.HashMap;
import java.util.Map;

public class question1 {
    public static void main(String[] args) {
        // write your code here
        int[] question1arr1 = {1,2,3,2};
        int[] question1arr2 = {1,1,1,1,1};
        int question1Res1 = question1(question1arr1);
        int question1Res2 = question1(question1arr2);
        System.out.println(question1Res1+" "+question1Res2);
    }

    //Time:O(n) Space:O(n)
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
}
