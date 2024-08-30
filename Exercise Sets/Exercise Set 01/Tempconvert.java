import java.util.Scanner;

public class Tempconvert {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Celsius value: ");
        int cel = input.nextInt();
        int f = (cel * 9/5 + 32);
        System.out.println(cel + " Celsius is " + f + " Fahrenheit");
        input.close();
    }
}
