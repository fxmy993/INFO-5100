package edu.northeastern.fxmy;

public class Sum {
    public static void main(String[] args){
        Sum sum = new Sum();
    System.out.println(sum.add(2,3));
    System.out.println(sum.add(4,9,12));
    System.out.println(sum.add(4, 5.0));
    System.out.println(sum.add(15.5, 5));
    System.out.println(sum.add(1.0, 6.4));
    }

    public Sum(){
    }

    public static int add(int a,int b){
        return a+b;
    }
    public static int add(int a,int b,int c){
        return a+b+c;
    }
    public static double add(double a,int b){
        return a+b;
    }
    public static double add(int a,double b){
        return a+b;
    }
    public static double add(double a,double b){

        return a+b;
    }
}
