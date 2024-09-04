import java.util.Scanner;

public class RunwayLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number for speed:");
        System.out.println("enter a number for acceleration:");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();
        double length = (speed*speed)/(2*acceleration);
        System.out.println(length);
    }
}
