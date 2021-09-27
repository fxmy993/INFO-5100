package edu.northeastern.fxmy;

public class question5 {
    public static void main(String[] args) {
        // write your code here
        String str = "1A3d4s5t";
        String str1 = "A2bb2d4";
        boolean res = question5(str);
        boolean res1 = question5(str1);
        System.out.println(res);
        System.out.println(res1);
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
