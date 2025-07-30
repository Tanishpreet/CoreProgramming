package JavaMethods.Level1;

import java.util.Scanner;

public class NumberPosOrNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(checkNumber(num));
    }
    public static int checkNumber(int n){
        if(n>0){
            return 1;
        }
        if(n<0){
            return -1;
        }
        else{
            return 0;
        }
    }
}
