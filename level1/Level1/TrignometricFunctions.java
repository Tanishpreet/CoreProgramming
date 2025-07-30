package JavaMethods.Level1;

import java.util.Scanner;

public class TrignometricFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the angle in degree");
        double angle = sc.nextDouble();
        double [] ans = calculateTrignometricFunctions(angle);
        System.out.println("Sine of angle = "+ans[0]);
        System.out.println("Cosine of angle = "+ans[1]);
        System.out.println("Tan of angle = "+ans[2]);

    }
    public static double []calculateTrignometricFunctions(double angle){
        double rad = Math.toRadians(angle);
        double [] values = new double[3];
        values[0] = Math.sin(rad);
        values[1] = Math.cos(rad);
        values[2]= Math.tan(rad);
        return values;
    }
}
