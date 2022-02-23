import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanley = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanley.nextLine();

        System.out.println("Hello " + name);
        scanley.close();
    }
}
