import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x > 100) {
            System.out.println("More than 100");
        }else if (x > 10){
            System.out.println("More than 10");
        } else if (x > 0){
            System.out.println("x is digit");
        }else {
            System.out.println("x is negative value");
        }
    }
}
