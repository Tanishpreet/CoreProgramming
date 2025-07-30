package JavaMethods.Level1;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month number (1 as Jan, 2 as Feb....)");
        int month = sc.nextInt();
        System.out.println("Enter date");
        int day = sc.nextInt(); 
        if(checkSpring(month, day)){
            System.out.println("Its a Spring Season");
        }else{
            System.out.println("Not a Spring Season");
        }
    }
    public static boolean checkSpring(int month, int day){
        if(month==3 && day>20 || month>3 && month<6 || month ==6 && day<20){
            return true;
        }
        else{
            return false;
        }
    }
}
