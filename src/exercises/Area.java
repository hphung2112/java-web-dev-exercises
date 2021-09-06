package exercises;
import java.util.Scanner;

public class Area {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Length of the rectangle in feet: ");
        Double length = input.nextDouble();

        System.out.println("Width of the rectangle in feet: ");
        Double width = input.nextDouble();
        input.close();

        Double area = length * width;
        System.out.println("The area of the rectangle is " + area + " square foot.");
    }
}
