package edu.northeastern.fxmy;

public class question4 {
    public static void main(String[] args){
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] b = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotate(a);
        rotate(b);
        print(a);
        print(b);
    }

    //Time: O(n^2) Space: O(1)
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i=0;i<matrix.length/2;i++){
            for(int j =i;j<n-i-1;j++){
                int temp =matrix[i][j];
                matrix[i][j] = matrix[n-j-1][i];
                matrix[n-j-1][i] = matrix[n-i-1][n-j-1];
                matrix[n-i-1][n-j-1] = matrix[j][n-i-1];
                matrix[j][n-i-1] = temp;
            }
        }
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
