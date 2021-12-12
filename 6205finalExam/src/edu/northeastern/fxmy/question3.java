package edu.northeastern.fxmy;

import java.util.Arrays;
import java.util.Stack;

public class question3 {

    public static void main(String[] args) {
        int[] arr = {1,3,5,8,9,2,6,7,6,8,9};
        int[] arr1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println(jump(arr1));
    }
    public static int jump(int[] arr){

        if(arr==null||arr.length<=0){
            return -1;
        }
        if(arr.length==1){
            return 1;
        }
        int[] count = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            count[i] = Integer.MAX_VALUE;
        }
        count[0] = 0;
        if(arr[0]>=arr.length-1){
            return 1;
        }
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+i>=j){
                    if (count[j]>count[i]+1){
                        count[j]=count[i]+1;
                    }
                }
            }
        }
        if(count[count.length -1] == Integer.MAX_VALUE){
            return -1;
        }
        return count[arr.length-1];
    }
}
