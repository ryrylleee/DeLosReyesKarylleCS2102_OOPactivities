import java.util.Scanner;

    public class GettingGreater {
        public static void main(String[] args) {
            
            System.out.println("Getting the Greater Value");
            Scanner chValue = new Scanner(System.in);
            System.out.print("Enter first character: ");
            char ch1 = chValue.next().charAt(0);
            System.out.print("Enter second character: ");
            char ch2 = chValue.next().charAt(0);

            char greater = (char) Math.max(ch1, ch2);
            int AsciiValue = ch1;
            int anotherAsciiValue = ch2;

            System.out.println("------------------------------------------");
            System.out.println("The character with greater value is: " + greater);
            System.out.println("------------------------------------------");
            System.out.println("Showing the ASCII Codes");
            System.out.println(ch1 + ":" + AsciiValue);
            System.out.println(ch2 + ":" + anotherAsciiValue);

        chValue.close();
        }
}
