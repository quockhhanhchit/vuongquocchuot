import java.util.Scanner;

public class activity3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter x1 and y1");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("enter x2 and y2");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double chim =  Math.pow(x2-x1,2) + Math.pow(y2-y1,2);
        double distance = Math.pow(chim,0.5);
        System.out.println(" the distance between the two points is:"distance);

    }
}
