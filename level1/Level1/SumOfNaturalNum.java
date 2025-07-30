package JavaMethods.Level1;

import java.util.Scanner;

public class SumOfNaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Sum of "+num+" natural number is "+sum(num));
    }
    public static int sum(int n){
        int total=0;
        for(int i=1;i<=n;i++){
            total = total+i;
        }
        return total;
    }
}
