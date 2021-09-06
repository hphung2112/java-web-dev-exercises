package exercises;
import java.util.Scanner;

public class Milespergallon {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Miles driven: ");
        Double miles = input.nextDouble();

        System.out.println("Gallons used: ");
        Double gallons = input.nextDouble();
        input.close();

        Double milesPerGallon = miles/gallons;
        System.out.println("The miles per gallon is " + milesPerGallon + "mpg.");
    }
}
