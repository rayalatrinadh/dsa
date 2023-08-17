package com.MAANG_Interviews;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        System.out.println(largestInteger(1234));



    }

    public static int largestInteger(int num) {

        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder()); // priority queue to store odd digits in descending order
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder()); // priority queue to store even digits in descending order
        String nums = Integer.toString(num); // converting num to a string for easy access of the digits
        int n = nums.length(); // n stores the number of digits in num

        for (int i = 0; i < n; i++) {
            int digit = nums.charAt(i) - '0';
            if (digit % 2 == 1) // if digit is odd, push it into priority queue p
                p.add(digit);
            else
                q.add(digit); // if digit is even, push it into priority queue q
        }

        int answer = 0;
        for (int i = 0; i < n; i++) {
            answer *= 10;
            if ((nums.charAt(i) - '0') % 2 == 1) { // if the digit is odd, add the largest odd digit of p into the answer
                answer += p.peek();
                p.poll();
            }
            else { // if the digit is even, add the largest even digit of q into the answer
                answer += q.peek();
                q.poll();
            }
        }
        return answer;
    }
}
