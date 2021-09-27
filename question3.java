package edu.northeastern.fxmy;

import java.util.HashMap;
import java.util.Map;

public class question3 {
    public static void main(String[] args) {
        // write your code here
        int[] arr = {2,3,4,2,2,3,5,7};
        int[] arr1 = {1,3,3,1,6,7,7,8,9};
        int res = question3(arr);
        int res1 = question3(arr1);
        System.out.println(res);
        System.out.println(res1);
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
}
