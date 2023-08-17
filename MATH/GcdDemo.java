package MATH;

public class GcdDemo {

    public static void main(String args[]){
        System.out.println(2 % 10);
        System.out.println(10 % 2);
        //System.out.println(12%0);
        System.out.println(0%12);
        int ans = findGcd(10,2);
        System.out.println("ans : "+ ans);
    }
    public static int findGcd(int a, int b){
        if(b == 0)
            return a;
        return findGcd(b,a%b);
    }
}
