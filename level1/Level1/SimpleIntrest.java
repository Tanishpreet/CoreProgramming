package JavaMethods.Level1;
import java.util.Scanner;
public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        int time = sc.nextInt();
        calculateSimpleInterest(principal, rate, time);
    }
    public static void calculateSimpleInterest(double principal, double rate, int time) {
        double si = (principal * rate * time) / 100;
        System.out.println("The Simple Interest is " + si +
                " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
    }
}
