package com.MAANG_Interviews;

import java.util.Scanner;

public class BitwiseOperatorsDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();


        int ans = addition(a,b);
        System.out.println(ans);


    }

    public static int addition(int a,int b){
        if(b == 0)
            return a;

        return  addition((a^b),(a&b) <<1);
    }
}
