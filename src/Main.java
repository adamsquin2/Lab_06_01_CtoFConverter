import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double celsius = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the degrees in celsius: ");
        if (in.hasNextDouble())
        {

            celsius = in.nextDouble();
        }

        else
        {
            System.out.println("Must Enter a valid answer for celsius");
        }
        double fahrenheit = (celsius * 1.8) + 32;

        System.out.println("The degrees in fahrenheit is: " + fahrenheit);
    }
}