package edu.northeastern.fxmy;

public class question1 {

    public static void main(String[] args){
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] b = {{1,2,3},{4,5,6}};
        print(transpose(a));
        print(transpose(b));

    }
    //Time: O(n*n) Space: O(m*n)
    public static int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] res = new int[n][m];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                res[j][i] = matrix[i][j];
            }
        }

        return res;
    }

    private static void print(int[][] a){
        int m = a.length;
        int n = a[0].length;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

