package com.MAANG_Interviews;

import java.util.Scanner;

public class SquareRootBinarySearch {
    public static void main(String args[]){
        System.out.println("enter the number to find square : ");
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
       int ans = squareRoot(x);
       System.out.println("ans : " + ans );
    }
    public static int squareRoot(int x){


        if(x == 0 )
            return 0;


        int left = 1;
        int right = x;


        while(true){
            int mid = left + (right  - left) / 2;

            if(mid > x/mid)
                right = mid - 1;
            else {
                if(mid + 1  > x/(mid + 1))
                    return mid;

                left = mid + 1;
            }
        }
    }
}
