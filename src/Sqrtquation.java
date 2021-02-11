import java.util.Scanner;

public class Sqrtquation {

    public static void main(String[] args) {
        System.out.println("Введите коэффицента a.b.c");
        Scanner in = new Scanner(System.in);
        double a = in.nextInt(), b  = in.nextInt(), c = in.nextInt();
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0){
            System.out.println("Корней нет");
        }else if (discriminant == 0) {
            System.out.println("Eдинственный корень x = " + (-b / (2 * a)));
        }else {
            System.out.println("Два корня");
            double x1 = -b - Math.sqrt(discriminant) / (2 * a);
            double x2 = -b + Math.sqrt(discriminant) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);

        }
    }
}

