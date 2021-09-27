package edu.northeastern.fxmy;

import static edu.northeastern.fxmy.Main.print;

public class question2 {

    public static void main(String[] args) {

        int[] arr1 = {-4,-1,0,3,10};
        int[] arr2 = {-7,-3,2,3,11};
        int[] Res1 = question2(arr1);
        int[] Res2 = question2(arr2);
        print(Res1);
        print(Res2);
    }

    public static void print(int[] nums){
        for(int i = 0;i<nums.length;i++){
            System.out.print(nums[i]+",");
        }
        System.out.println();
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
}
