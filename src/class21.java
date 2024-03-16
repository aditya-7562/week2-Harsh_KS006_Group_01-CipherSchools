import java.util.Scanner;

public class class21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your First name: ");
        String firstName = sc.nextLine();
        System.out.print("Please enter your Last name: ");
        String lastName = sc.nextLine();
        System.out.print("Please enter your Profession: ");
        String profession = sc.nextLine();
        System.out.print("Please enter your Address: ");
        String address = sc.nextLine();
        System.out.print("Please enter your House number: ");
        int number = Integer.parseInt(sc.nextLine());
        System.out.print("Please enter your Percentage: ");
        float percentage = Float.parseFloat(sc.nextLine());

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Profession: " + profession);
        System.out.println("Address: " + address);
        System.out.println("House Number: " + number);
        System.out.println("Percentage: " + percentage);

        sc.close();
    }
}
