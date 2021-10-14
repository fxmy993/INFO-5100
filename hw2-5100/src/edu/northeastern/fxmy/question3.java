package edu.northeastern.fxmy;

public class question3 {

    public void main(String[] args){
        int[] a = {0,1,0,3,12};
        int[] b = {0};
        moveZeroes(a);
        moveZeroes(b);
        print(a);
        print(b);
    }

    //Time: O(n) Space: O(1)
    public static void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0)
            return;

        int insertPos = 0;
        for (int num: nums) {
            if (num != 0)
                nums[insertPos++] = num;
        }

        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }

    private static void print(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
