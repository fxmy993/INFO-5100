package edu.northeastern.fxmy;
import java.util.*;
public class question5 {

    public static void main(String[] args){
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] b = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        print(spiralOrder(a));
        print(spiralOrder(b));
    }

    //Time: O(m*n) Space: O(n)
    public static List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List res = new ArrayList();
        if(m+n<1){
            res.add(matrix[0][0]);
            return res;
        }
        int x = 0;
        while(x<m&&x<n&&matrix[x][x]!=101){
            moveAround(matrix,x,res,m,n);
            x++;
        }
        return res;
    }

    public static void moveAround(int[][] matrix,int x,List res,int m,int n){
        for(int i = x;i<n-x-1;i++){
            res.add(matrix[x][i]);
            matrix[x][i] = 101;
        }
        for(int i = x;i<m-x-1;i++){
            res.add(matrix[i][n-x-1]);
            matrix[i][n-x-1] = 101;
        }
        for(int i = n-x-1;i>=x;i--){
            if(matrix[m-x-1][i] == 101)
                break;
            res.add(matrix[m-x-1][i]);
            matrix[m-x-1][i] = 101;
        }
        for(int i = m-x-2;i>=x+1;i--){
            if(matrix[i][x] == 101)
                break;
            res.add(matrix[i][x]);
            matrix[i][x] = 101;
        }
    }

    private static void print(List a){
        while(!a.isEmpty()){
            System.out.print(a.remove(0)+" ");
        }
        System.out.println();
    }
}
