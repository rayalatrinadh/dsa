package com.MAANG_Interviews;

import java.util.Arrays;

public class MatrixNegativeNumsCount {
    public static void main(String args[]){
        int row = 4;
        int col = 4;
        int[][] matrix = {
                {1,2,3,4},{5,6,7,8},{9,10,11,12}
        };

       for(int i = 0; i < matrix.length; i++){
           for(int j = 0; j < matrix[i].length; j++){
               System.out.print(matrix[i][j] + " ");
           }
           System.out.println();
       }

       int ans = countNegatives(matrix);

    }
    public static int countNegatives(int[][] grid) {
        // int count = 0;
        // for(int i = 0; i < grid.length; i++){
        //     for(int j = 0; j < grid[i].length; j++){
        //         if(grid[i][j] < 0)
        //            count++;
        //     }
        // }
        // return count;


        int rows = grid.length;
        int cols = grid[0].length;
        int res = 0;
        int lastNeg = cols-1;

        for(int row = 0; row < rows; row++){
            if(grid[row][0] < 0){
                res += cols;
                continue;
            }

            if(grid[row][cols - 1] > 0)
                continue;


            int l = 0;
            int r = lastNeg;
            while(l <= r){
                int m = l + (r - l)/2;
                if(grid[row][m] < 0){
                    r = m - 1;
                }else
                    l =  m + 1;
            }

            res += (cols - l);
            lastNeg = l;
        }
        return res;
    }
}
